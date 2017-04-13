package org.matmaul.freeboxos.airmedia;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class AirMediaReceiver {
	protected String name;
	protected Boolean password_protected;
	protected Capabilities capabilities;
	
	public String getName() {
		return name;
	}
	public Boolean isPasswordProtected() {
		return password_protected;
	}
	public Boolean isPhotoCapable() {
		return (capabilities != null) ? capabilities.photo : null;
	}
	public Boolean isScreenCapable() {
		return (capabilities != null) ? capabilities.screen : null;
	}
	public Boolean isAudioCapable() {
		return (capabilities != null) ? capabilities.audio : null;
	}
	public Boolean isVideoCapable() {
		return (capabilities != null) ? capabilities.video : null;
	}
	
	private static class Capabilities {
		public Boolean photo;
		public Boolean screen;
		public Boolean audio;
		public Boolean video;
	}
}
