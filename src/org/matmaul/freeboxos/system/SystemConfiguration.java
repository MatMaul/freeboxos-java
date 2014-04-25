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
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class SystemConfiguration {
	protected String firmware_version;
	protected String mac;
	protected String serial;
	protected String uptime;
	protected String board_name;
	protected Integer temp_cpum;
	protected Integer temp_sw;
	protected Integer temp_cpub;
	protected Integer fan_rpm;
	
	protected String box_authenticated;
	protected Long uptime_val;
	
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
	public Integer getTemp_cpum() {
		return temp_cpum;
	}
	public Integer getTemp_sw() {
		return temp_sw;
	}
	public Integer getTemp_cpub() {
		return temp_cpub;
	}
	public Integer getFan_rpm() {
		return fan_rpm;
	}
	public Long getUptimeVal() {
		return uptime_val;
	}
}
