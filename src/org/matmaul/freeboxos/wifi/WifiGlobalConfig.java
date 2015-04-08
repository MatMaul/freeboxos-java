package org.matmaul.freeboxos.wifi;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)

public class WifiGlobalConfig {
	protected Boolean enabled;
	protected String mac_filter_state; // enum disabled, whitelist, blacklist
	
	public Boolean getEnabled() {
		return enabled;
	}
	
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	public String getMacFilterState() {
		return mac_filter_state;
	}
}
/*public class WifiGlobalConfig {
	public BSS bss;
	public Ap_Params ap_params;
	
	public static class BSS {
		public Perso perso;
	}
	public static class Perso {
		public Boolean enabled;
		public String ssid;
		public String encryption;
		public int eapol_version;
		public Boolean hide_ssid;
		public String mac_filter;
		public String key;
	}
	
	public static class Ap_Params {
		public Boolean enabled;
		public String ht_mode;
		public int channel;
	}
	
	public Boolean getEnabled() {
		return ap_params.enabled;
	}
	
	public void setEnabled(Boolean enabled) {
		ap_params.enabled = enabled;
		bss.perso.enabled = enabled;
	}
	
	public String getMacFilter() {
		return bss.perso.mac_filter;
	}
}*/
