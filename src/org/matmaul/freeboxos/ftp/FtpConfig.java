package org.matmaul.freeboxos.ftp;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class FtpConfig {
	protected Boolean enabled;
	protected boolean allow_anonymous;
	protected boolean allow_anonymous_write;
	protected String password;
	
	public Boolean getEnabled() {
		return enabled;
	}
	public Boolean getAllowAnonymous() {
		return allow_anonymous;
	}
	public Boolean getAllowAnonymousWrite() {
		return allow_anonymous_write;
	}
	public String getPassword() {
		return password;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public void setAllowAnonymous(Boolean allow) {
		this.allow_anonymous = allow;
	}
	public void setAllowAnonymousWrite(Boolean allow) {
		this.allow_anonymous_write = allow;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
