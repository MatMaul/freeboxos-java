package org.matmaul.freeboxos.airmedia;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class AirMediaConfig {
	protected Boolean enabled;
	protected String password;
	
	public Boolean getEnabled() {
		return enabled;
	}
	public String getPassword() {
		return password;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
