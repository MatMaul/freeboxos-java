package org.matmaul.freeboxos.upnpav;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class UPnPAVManager {
	protected RestManager restManager;

	public UPnPAVManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public UPnPAVConfig getConfig() throws FreeboxException {
		return restManager.get("upnpav/config/", UPnPAVResponse.UPnPAVConfigResponse.class);
	}
	
	public UPnPAVConfig setConfig(UPnPAVConfig config) throws FreeboxException {
		return restManager.put("upnpav/config/", restManager.createJsonEntity(config), UPnPAVResponse.UPnPAVConfigResponse.class);
	}

}
