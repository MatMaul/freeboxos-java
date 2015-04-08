package org.matmaul.freeboxos.lcd;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class LCDManager {
	protected RestManager restManager;

	public LCDManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public LCDConfig getLCDConfig() throws FreeboxException {
		return restManager.get("lcd/config/", LCDResponses.LCDConfigResponse.class);
	}
	
	public LCDConfig setLCDConfig(LCDConfig config) throws FreeboxException {
		return restManager.put("lcd/config/", restManager.createJsonEntity(config), LCDResponses.LCDConfigResponse.class);
	}

}
