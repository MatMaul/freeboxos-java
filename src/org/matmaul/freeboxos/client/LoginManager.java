/*
 * Copyright (c) 2013, Mathieu Velten. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package org.matmaul.freeboxos.client;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.json.simple.JSONObject;
import org.matmaul.freeboxos.client.internal.RestManager;
import org.matmaul.freeboxos.client.internal.Responses;
import org.matmaul.freeboxos.client.internal.Session;

public class LoginManager {

	protected RestManager restManager;
	protected Integer trackId;
	protected String sessionToken;
	protected String appToken;
	protected String appId;

	public LoginManager(String appId, RestManager restManager) {
		this.appId = appId;
		this.restManager = restManager;
	}

	@SuppressWarnings("unchecked")
	public Authorize newAuthorize(String appName, String appVersion, String deviceName) throws FreeboxException {
		JSONObject req = new JSONObject();
		req.put("app_id", appId);
		req.put("app_name", appName);
		req.put("app_version", appVersion);
		req.put("device_name", deviceName);
		Authorize authorize = restManager.post("login/authorize/", RestManager.createJsonEntity(req), Responses.AuthorizeResponse.class, false);
		setTrackId(authorize.getTrackId());
		setAppToken(authorize.getAppToken());
		return authorize;
	}


	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public static final String AUTHORIZE_GRANTED = "granted";

	public String trackAuthorize() throws FreeboxException {
		if (trackId == null) {
			throw new FreeboxException(null, "no trackId");
		}
		return restManager.get("login/authorize/" + trackId, Responses.TrackAuthorizeResponse.class, false).getStatus();
	}

	@SuppressWarnings("unchecked")
	public String openSession() throws FreeboxException {
		if (appToken == null) {
			throw new FreeboxException(null, "no appToken");
		}
		String challenge = login();
		JSONObject req = new JSONObject();
		req.put("app_id", appId);
		req.put("password", hmacSha1(appToken, challenge));

		Session session = restManager.post("login/session/", RestManager.createJsonEntity(req), Responses.SessionResponse.class, false);
		sessionToken = session.getSessionToken();
		return sessionToken;
	}


	protected static String hmacSha1(String key, String value) {
		try {
			// Get an hmac_sha1 key from the raw key bytes
			byte[] keyBytes = key.getBytes();           
			SecretKeySpec signingKey = new SecretKeySpec(keyBytes, "HmacSHA1");

			// Get an hmac_sha1 Mac instance and initialize with the signing key
			Mac mac = Mac.getInstance("HmacSHA1");
			mac.init(signingKey);

			// Compute the hmac on input data bytes
			byte[] rawHmac = mac.doFinal(value.getBytes());

			// Convert raw bytes to Hex
			byte[] hexBytes = new Hex().encode(rawHmac);

			//  Covert array of Hex bytes to a String
			return new String(hexBytes, "UTF-8");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String login() throws FreeboxException {
		return restManager.get("login/", Responses.ChallengeResponse.class, false).getChallenge();
	}
}
