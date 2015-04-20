package org.matmaul.freeboxos.airmedia;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class AirMediaManager {
	protected RestManager restManager;

	public AirMediaManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public AirMediaConfig getConfig() throws FreeboxException {
		return restManager.get("airmedia/config/", AirMediaResponse.AirMediaConfigResponse.class);
	}
	
	public AirMediaConfig setConfig(AirMediaConfig config) throws FreeboxException {
		return restManager.put("airmedia/config/", restManager.createJsonEntity(config), AirMediaResponse.AirMediaConfigResponse.class);
	}

}
