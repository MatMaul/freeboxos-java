package org.matmaul.freeboxos.lcd;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)

public class LCDConfig {
	private int brightness;					// the screen brightness (range from 0 to 100)
	private Boolean orientation_forced;		// is the screen orientation forced
	private int orientation;				// the screen orientation angle
	
	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	
	public Boolean getOrientationForced() {
		return orientation_forced;
	}
	public void setOrientationForced(Boolean orientation_forced) {
		this.orientation_forced = orientation_forced;
	}
	public int getOrientation() {
		return orientation;
	}
	
	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
}

