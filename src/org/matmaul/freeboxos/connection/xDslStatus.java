package org.matmaul.freeboxos.connection;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class xDslStatus {
	protected internalxDslStatus status;
	
	public static class internalxDslStatus {
		public String status; 		// enum ro down, training,started,chan_analysis,msg_exchange,showtime,disabled
		public String protocol; 	// enum ro t1414, adsl1_a, adsl2_a, adsl2plus_a, readsl2, adsl2_m, adsl2plus_m, unknown
		public String modulation; 	// enum ro adsl, vdsl
		public Long uptime;
	}
	
	public String getStatus() {
		return status.status;
	}
	public String getProtocol() {
		return status.protocol;
	}
	public String getModulation() {
		return status.modulation;
	}
}
