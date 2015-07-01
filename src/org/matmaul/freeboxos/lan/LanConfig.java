package org.matmaul.freeboxos.lan;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class LanConfig {
	protected String ip;
	protected String name;
	protected String name_dns;
	protected String name_mdns;
	protected String name_netbios;
	protected String mode;	// router, bridge
	
	public String getIp() {
		return ip;
	}
	public String getName() {
		return name;
	}
	public String getNameDns() {
		return name_dns;
	}
	public String getNameMdns() {
		return name_mdns;
	}
	public String getNameNetbios() {
		return name_netbios;
	}
	public String getMode() {
		return mode;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNameDns(String dns) {
		this.name_dns = dns;
	}
	public void setNameMdns(String mdns) {
		this.name_mdns = mdns;
	}
	public void setNameNetbios(String name_netbios) {
		this.name_netbios = name_netbios;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
}
