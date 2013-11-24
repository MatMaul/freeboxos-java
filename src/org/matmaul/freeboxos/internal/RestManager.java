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
package org.matmaul.freeboxos.internal;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.FreeboxOsClient;
import org.matmaul.freeboxos.LoginManager;

public class RestManager {
	protected HttpClient httpClient;
	protected ObjectMapper jsonMapper;
	protected FreeboxOsClient client;
	protected String baseAddress;
	protected LoginManager loginManager;

	
	public RestManager(FreeboxOsClient client, String host) {
		this.client = client;
		this.baseAddress = "http://" + host + "/api/v1/";
		httpClient = HttpClientBuilder.create().build();
		jsonMapper = new ObjectMapper();
		jsonMapper.enable(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		jsonMapper.getDeserializationConfig().addHandler(new DeserializationProblemHandler() {

			@Override
			public boolean handleUnknownProperty(DeserializationContext ctxt,
					JsonDeserializer<?> deserializer, Object beanOrClass,
					String propertyName) throws IOException,
					JsonProcessingException {
				if ("challenge".equals(propertyName) || "password_salt".equals(propertyName)) {
					return true;
				}
				return false;
			}
		});
	}

	public void setLoginManager(LoginManager loginManager) {
		this.loginManager = loginManager;
	}
	
	public String getBaseAddress() {
		return baseAddress;
	}
	
	public static  HttpEntity createMultipartEntity(InputStream content, long length, String fileName) throws IOException {
		return MultipartEntityBuilder.create().addPart(fileName, new InpuStreamBody(content, length, fileName)).build();
	}

	public static HttpEntity createJsonEntity(JSONObject jsonObj) {
		return new StringEntity(jsonObj.toString(), ContentType.APPLICATION_JSON);
	}
	
	public <T extends Response<F>, F> F delete(String path, Class<T> beanClass) throws FreeboxException {
		HttpDelete delete = new HttpDelete(getBaseAddress() + path);
		return execute(delete, beanClass, true);
	}

	public <T extends Response<F>, F> F get(String path, Class<T> beanClass) throws FreeboxException {
		return get(path, beanClass, true);
	}

	public <T extends Response<F>, F> F get(String path, Class<T> beanClass, boolean retryAuth) throws FreeboxException {
		HttpGet get = new HttpGet(getBaseAddress() + path);
		return execute(get, beanClass, retryAuth);
	}

	protected <T extends Response<F>, F> F readValue(InputStream content, Class<T>  beanClass) throws IOException, FreeboxException {
		T response = jsonMapper.readValue(content, beanClass);
		response.evaluate();
		F result = response.getResult();
		if (result instanceof ActiveBean) {
			((ActiveBean)result).setClient(client);
		}
		return result;
	}

	public <T extends Response<F>, F> F post(String path, HttpEntity entity, Class<T> beanClass) throws FreeboxException {
		return post(path, entity, beanClass, true);
	}
	
	public <T extends Response<F>, F> F post(String path, HttpEntity entity, Class<T> beanClass, boolean retryAuth) throws FreeboxException {
		HttpPost post = new HttpPost(getBaseAddress() + path);
		post.setEntity(entity);
		return execute(post, beanClass, retryAuth);
	}
	
	public static final String AUTHORIZATION_REQUIRED = "auth_required";
	
	public InputStream execute(HttpUriRequest req, boolean retryAuth) throws FreeboxException {
		if (loginManager.getSessionToken() != null) {
			req.addHeader(getAuthHeader(), loginManager.getSessionToken());
		}
			HttpResponse res;
			try {
				res = httpClient.execute(req);
				return res.getEntity().getContent();
			} catch (Exception e) {
				throw new FreeboxException(e);
			}

	}

	public <T extends Response<F>, F> F execute(HttpUriRequest req, Class<T> beanClass, boolean retryAuth) throws FreeboxException {
		try {
		return readValue(execute(req, retryAuth), beanClass);
		} catch (FreeboxException e) {
			if (retryAuth && AUTHORIZATION_REQUIRED.equals(e.getErrorCode())) {
				loginManager.openSession();
				return execute(req, beanClass, false);
			}
			throw e;
		} catch (Exception e) {
			throw new FreeboxException(e);
		}
	}

	protected String getAuthHeader() {
		return "X-Fbx-App-Auth";
	}
}
