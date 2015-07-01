package org.matmaul.freeboxos.lan;

import java.util.Calendar;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class LanHostConfig {
	protected String id;
	protected String primary_name;
	protected String host_type;
		// workstation, laptop, smartphone, tablet, printer, vg_console, television, nas, ip_camera, ip_phone,
		// freebox_player, freebox_hd, networking_device, multimedia_device, other
	protected Boolean primary_name_manual;
	protected List<LanHostL2Ident> l2ident;
	protected String vendor_name;
	protected Boolean persistent;
	protected Boolean reachable;
	protected long last_time_reachable;
	protected Boolean active;
	protected long last_activity;
	protected List<LanHostName> names;
	protected List<LanHostL3Connectivity> l3connectivities;
	
	public String getId() {
		return id;
	}
	public String getPrimaryName() {
		return primary_name;
	}
	public String getHostYype() {
		return host_type;
	}
	public Boolean getPrimaryNameManual() {
		return primary_name_manual;
	}
	public List<LanHostL2Ident> getL2ident() {
		return l2ident;
	}
	public String getVendorName() {
		return vendor_name;
	}
	public Boolean getPersistent() {
		return persistent;
	}
	public Boolean getReachable() {
		return reachable;
	}
	public Calendar getLastTimeReachable() {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(last_time_reachable * 1000);
		return c;
	}
	public Boolean getActive() {
		return active;
	}
	public Calendar getLastActivity() {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(last_activity * 1000);
		return c;
	}
	public List<LanHostName> getNames() {
		return names;
	}
	public List<LanHostL3Connectivity> getL3connectivities() {
		return l3connectivities;
	}
	
	public void setPrimaryName(String primary_name) {
		this.primary_name = primary_name;
	}
	public void setHostType(String host_type) {
		this.host_type = host_type;
	}
	public void setPersistent(Boolean persistent) {
		this.persistent = persistent;
	}
	
	public String getMAC() {
		String mac = "";
		if (l2ident != null) {
			for (LanHostL2Ident l2 : l2ident) {
				if (l2.getType().equalsIgnoreCase("mac_address")) {
					mac = l2.getId();
					break;
				}
			}
		}
		return mac;
	}
	
	public Boolean isIpReachable(String ip) {
		Boolean reachable = false;
		if (l3connectivities != null) {
			for (LanHostL3Connectivity l3 : l3connectivities) {
				if (l3.getAddr().equalsIgnoreCase(ip) && l3.getReachable()) {
					reachable = true;
					break;
				}
			}
		}
		return reachable;
	}

}
