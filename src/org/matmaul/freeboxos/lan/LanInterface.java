package org.matmaul.freeboxos.lan;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class LanInterface {
	protected String name;
	protected int host_count;
	
	public String getName() {
		return name;
	}
	public int getHostCount() {
		return host_count;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHostCount(int host_count) {
		this.host_count = host_count;
	}
	
}
