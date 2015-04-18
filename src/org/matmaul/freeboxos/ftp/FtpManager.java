package org.matmaul.freeboxos.ftp;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class FtpManager {
	protected RestManager restManager;

	public FtpManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public FtpConfig getConfig() throws FreeboxException {
		return restManager.get("ftp/config/", FtpResponse.FtpConfigResponse.class);
	}
	
	public FtpConfig setConfig(FtpConfig config) throws FreeboxException {
		return restManager.put("ftp/config/", restManager.createJsonEntity(config), FtpResponse.FtpConfigResponse.class);
	}

}
