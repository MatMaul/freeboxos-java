package org.matmaul.freeboxos.phone;

import java.util.List;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;
import org.matmaul.freeboxos.phone.PhoneResponses;

public class PhoneManager {
	protected RestManager restManager;

	public PhoneManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public PhoneConfig getPhoneConfig() throws FreeboxException {
		return restManager.get("phone/config/?_dc=1415032391207", PhoneResponses.PhoneConfigResponse.class);
	}
	
	public List<PhoneStatus> getPhoneStatus() throws FreeboxException {
		return restManager.get("phone/?_dc=1415032391207", PhoneResponses.PhoneStatusResponse.class);
	}
}
