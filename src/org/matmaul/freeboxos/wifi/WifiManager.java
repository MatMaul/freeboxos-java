package org.matmaul.freeboxos.wifi;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class WifiManager {
	protected RestManager restManager;

	public WifiManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public WifiGlobalConfig getGlobalConfig() throws FreeboxException {
		return restManager.get("wifi/config/", WifiResponses.WifiGlobalConfigResponse.class);
	}
	
	public WifiGlobalConfig setGlobalConfig(WifiGlobalConfig config) throws FreeboxException {
		return restManager.put("wifi/config/", restManager.createJsonEntity(config), WifiResponses.WifiGlobalConfigResponse.class);
	}

}
