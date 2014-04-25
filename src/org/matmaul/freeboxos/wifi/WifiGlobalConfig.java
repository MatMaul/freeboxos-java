package org.matmaul.freeboxos.wifi;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class WifiGlobalConfig {
	protected Boolean enabled;
	protected String mac_filter_state;
	
	public Boolean getEnabled() {
		return enabled;
	}
	public String getMac_filter_state() {
		return mac_filter_state;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
}
