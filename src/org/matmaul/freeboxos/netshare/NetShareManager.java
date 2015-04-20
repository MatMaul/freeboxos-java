package org.matmaul.freeboxos.netshare;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class NetShareManager {
	protected RestManager restManager;

	public NetShareManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public SambaConfig getSambaConfig() throws FreeboxException {
		return restManager.get("netshare/samba/", SambaResponses.SambaConfigResponse.class);
	}
	
	public SambaConfig setSambaConfig(SambaConfig config) throws FreeboxException {
		return restManager.put("netshare/samba/", restManager.createJsonEntity(config), SambaResponses.SambaConfigResponse.class);
	}

}
