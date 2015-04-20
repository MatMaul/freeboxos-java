package org.matmaul.freeboxos.netshare;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class SambaConfig {
	protected Boolean file_share_enabled;
	protected Boolean print_share_enabled;
	protected Boolean logon_enabled;
	protected String logon_user;
	protected String logon_password;
	protected String workgroup;
	
	public Boolean getFileShareEnabled() {
		return file_share_enabled;
	}

	public Boolean getPrintShareEnabled() {
		return print_share_enabled;
	}

	public Boolean getLogonEnabled() {
		return logon_enabled;
	}

	public String getLogonUser() {
		return logon_user;
	}

	public String getLogonPassword() {
		return logon_password;
	}

	public String getWorkgroup() {
		return workgroup;
	}

	public void setFileShareEnabled(Boolean file_share_enabled) {
		this.file_share_enabled = file_share_enabled;
	}

	public void setPrintShareEnabled(Boolean print_share_enabled) {
		this.print_share_enabled = print_share_enabled;
	}

	public void setLogonEnabled(Boolean logon_enabled) {
		this.logon_enabled = logon_enabled;
	}

	public void setLogonUser(String logon_user) {
		this.logon_user = logon_user;
	}

	public void setLogonPassword(String logon_password) {
		this.logon_password = logon_password;
	}

	public void setWorkgroup(String workgroup) {
		this.workgroup = workgroup;
	}

}
