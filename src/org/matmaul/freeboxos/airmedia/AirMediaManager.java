package org.matmaul.freeboxos.airmedia;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.Response.EmptyResponse;
import org.matmaul.freeboxos.internal.RestManager;

public class AirMediaManager {
	protected RestManager restManager;

	public AirMediaManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public AirMediaConfig getConfig() throws FreeboxException {
		return restManager.get("airmedia/config/", AirMediaResponses.AirMediaConfigResponse.class);
	}
	
	public AirMediaConfig setConfig(AirMediaConfig config) throws FreeboxException {
		return restManager.put("airmedia/config/", restManager.createJsonEntity(config), AirMediaResponses.AirMediaConfigResponse.class);
	}

	public List<AirMediaReceiver> getReceivers() throws FreeboxException {
		List<AirMediaReceiver> l = restManager.get("airmedia/receivers/", AirMediaResponses.AirMediaReceiversResponse.class);
		if (l == null) {
			l = Collections.emptyList();
		}
		return l;
	}
	
	public void sendRequestToReceiver(String receiver, AirMediaReceiverRequest request) throws FreeboxException {
		try {
			String encodedReceiver = URLEncoder.encode(receiver, "UTF-8");
			restManager.post("airmedia/receivers/" + encodedReceiver + "/", restManager.createJsonEntity(request), EmptyResponse.class);
		} catch (UnsupportedEncodingException e) {
			throw new FreeboxException("UTF-8 enconding not supported");
		}
	}

}
