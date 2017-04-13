package org.matmaul.freeboxos.airmedia;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class AirMediaReceiverRequest {
	protected String action;		// enum start stop
	protected String media_type;	// enum photo video
	protected String password;
	protected Integer position;
	protected String media;
	
	public void setAction(String action) {
		this.action = action;
	}
	public void setMediaType(String media_type) {
		this.media_type = media_type;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	
}
