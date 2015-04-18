package org.matmaul.freeboxos.lan;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class LanHostL2Ident {
	protected String id;
	protected String type;	// dhcp, netbios, mdns, upnp
	
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
}
