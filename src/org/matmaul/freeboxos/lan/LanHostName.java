package org.matmaul.freeboxos.lan;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class LanHostName {
	protected String name;
	protected String source;
	
	public String getName() {
		return name;
	}
	public String getSource() {
		return source;
	}
}
