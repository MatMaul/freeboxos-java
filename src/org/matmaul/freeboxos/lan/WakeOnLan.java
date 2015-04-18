package org.matmaul.freeboxos.lan;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class WakeOnLan {
	protected String mac;
	protected String password;
	
	public String getMac() {
		return mac;
	}
	public String getPassword() {
		return password;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
