package org.matmaul.freeboxos.ftp;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class FtpConfig {
	protected Boolean enabled;
	protected Boolean allow_anonymous;
	protected Boolean allow_anonymous_write;
	protected String password;
	protected Boolean weak_password;
	protected Boolean allow_remote_access;
	protected String remote_domain;
	protected int port_ctrl;
	protected int port_data;
	
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
	public Boolean getWeakPassword() {
		return weak_password;
	}
	public Boolean getAllowRemoteAccess() {
		return allow_remote_access;
	}
	public String getRemoteDomain() {
		return remote_domain;
	}
	public int getPortCtrl() {
		return port_ctrl;
	}
	public int getPortData() {
		return port_data;
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
	public void setAllowRemoteAccess(Boolean allow_remote_access) {
		this.allow_remote_access = allow_remote_access;
	}
	public void setRemoteDomain(String remote_domain) {
		this.remote_domain = remote_domain;
	}
	public void setPortCtrl(int port_ctrl) {
		this.port_ctrl = port_ctrl;
	}
	public void setPortData(int port_data) {
		this.port_data = port_data;
	}

}
