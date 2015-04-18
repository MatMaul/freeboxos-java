package org.matmaul.freeboxos.lan;

import java.util.List;

public class LanHostsConfig {
	protected List<LanHostConfig> config;

	public LanHostsConfig(List<LanHostConfig> config) {
		this.config = config;
	}

	public List<LanHostConfig> getConfig() {
		return config;
	}

	public void setConfig(List<LanHostConfig> config) {
		this.config = config;
	}

	public Boolean isMacReachable(String mac) {
		Boolean reachable = false;
		if (config != null) {
			for (LanHostConfig host : config) {
				if (host.getMAC().equalsIgnoreCase(mac) && host.getReachable()) {
					reachable = true;
					break;
				}
			}
		}
		return reachable;
	}

	public Boolean isIpReachable(String ip) {
		Boolean reachable = false;
		if (config != null) {
			for (LanHostConfig host : config) {
				if (host.isIpReachable(ip)) {
					reachable = true;
					break;
				}
			}
		}
		return reachable;
	}
	
	public Boolean isHostNameReachable(String name) {
		Boolean reachable = false;
		if (config != null) {
			for (LanHostConfig host : config) {
				if (host.getPrimaryName().equals(name) && host.getReachable()) {
					reachable = true;
					break;
				}
			}
		}
		return reachable;
	}

}
