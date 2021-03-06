/*
 * Copyright (c) 2013, Gaël L'hopital. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package org.matmaul.freeboxos.system;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = false)

public class SystemConfiguration {
	protected String firmware_version;
	protected String mac;
	protected String serial;
	protected String uptime;
	protected String board_name;
	protected String disk_status;
	protected long temp_cpum;
	protected long temp_sw;
	protected long temp_cpub;
	protected long fan_rpm;
	protected long uptime_val;
	protected boolean box_authenticated;
	protected String box_flavor;
	protected String user_main_storage;
	
	public String getFirmware_version() {
		return firmware_version;
	}
	public String getMac() {
		return mac;
	}
	public String getSerial() {
		return serial;
	}
	public String getUptime() {
		return uptime;
	}
	public String getBoard_name() {
		return board_name;
	}
	public String getDisk_status() {
		return disk_status;
	}
	public long getTemp_cpum() {
		return temp_cpum;
	}
	public long getTemp_sw() {
		return temp_sw;
	}
	public long getTemp_cpub() {
		return temp_cpub;
	}
	public long getFan_rpm() {
		return fan_rpm;
	}
	public long getUptimeVal() {
		return uptime_val;
	}
	public boolean getBoxAuthenticated() {
		return box_authenticated;
	}
	public String getBoxFlavor() {
		return box_flavor;
	}
	public String getUserMainStorage() {
		return user_main_storage;
	}
}
