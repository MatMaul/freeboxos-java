package org.matmaul.freeboxos.lan;

import java.util.Calendar;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class LanHostL3Connectivity {
	protected String addr;
	protected String af;	// ipv4, ipv6
	protected Boolean active;
	protected Boolean reachable;
	protected long last_activity;
	protected long last_time_reachable;
	public String getAddr() {
		return addr;
	}
	public String getAf() {
		return af;
	}
	public Boolean getActive() {
		return active;
	}
	public Boolean getReachable() {
		return reachable;
	}
	public Calendar getLastActivity() {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(last_activity * 1000);
		return c;
	}
	public Calendar getLastTimeReachable() {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(last_time_reachable * 1000);
		return c;
	}
}
