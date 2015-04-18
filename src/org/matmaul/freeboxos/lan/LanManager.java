package org.matmaul.freeboxos.lan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class LanManager {
	protected RestManager restManager;

	public LanManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public LanConfig getLanConfig() throws FreeboxException {
		return restManager.get("lan/config/", LanResponse.LanConfigResponse.class);
	}
	
	public LanConfig setLanConfig(LanConfig config) throws FreeboxException {
		return restManager.put("lan/config/", restManager.createJsonEntity(config), LanResponse.LanConfigResponse.class);
	}

	public List<LanInterface> getLanInterfaces() throws FreeboxException {
		List<LanInterface> l = restManager.get("lan/browser/interfaces/", LanResponse.LanInterfacesResponse.class);
		if (l == null) {
			l = Collections.emptyList();
		}
		return l;
	}

	public LanHostConfig getLanHostConfig(String lanInterface, String hostId) throws FreeboxException {
		return restManager.get("lan/browser/" + lanInterface + "/" + hostId + "/", LanResponse.LanHostConfigResponse.class);
	}

	public LanHostConfig setLanHostConfig(String lanInterface, String hostId, LanHostConfig config) throws FreeboxException {
		return restManager.put("lan/browser/" + lanInterface + "/" + hostId + "/", restManager.createJsonEntity(config), LanResponse.LanHostConfigResponse.class);
	}

	public LanHostsConfig getLanHostsConfig(String lanInterface) throws FreeboxException {
		List<LanHostConfig> l = restManager.get("lan/browser/" + lanInterface + "/", LanResponse.LanHostsConfigResponse.class);
		if (l == null) {
			l = Collections.emptyList();
		}
		return new LanHostsConfig(l);
	}

	public LanHostsConfig getAllLanHostsConfig() throws FreeboxException {
		List<LanHostConfig> hosts = new ArrayList<LanHostConfig>();
		List<LanInterface> interfaces = getLanInterfaces();
		for (LanInterface lanInterface : interfaces) {
			hosts.addAll(getLanHostsConfig(lanInterface.getName()).getConfig());
		}
		return new LanHostsConfig(hosts);
	}
	
	public WakeOnLan wakeOnLan(String host) throws FreeboxException  {
		WakeOnLan wol = new WakeOnLan();
		wol.setMac(host);
		return restManager.post("lan/wol/" + host + "/", restManager.createJsonEntity(wol), LanResponse.WakeOnLanResponse.class);
	}

}
