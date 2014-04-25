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
package org.matmaul.freeboxos.connection;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class ConnectionStatus {
	public String state;			// enum going_up 	connection is initializing, up 	connection is active, going_down 	connection is about to become inactive,     down 	connection is inactive 
	public String type;				// enum Read-only /ethernet 	FTTH/rfc2684 	xDSL (unbundled)/pppoatm 	xDSL 
	public String media;			// enum Read-only  ftth 	FTTH      xdsl 	xDSL
	public String ipv4; 			// Read-only Freebox IPv4 address NOTE: this field is only available when connection state is up*/
	public String ipv6; 			// Read-only Freebox IPv6 address NOTE: this field is only available when connection state is up
    public Long rate_up; 			// Read-only current upload rate in byte/s*/
    public Long rate_down; 			// Read-only current download rate in byte/s
    public Long rate_up_priv; 		// Read-only current upload rate in byte/s for Freebox services
    public Long rate_down_priv; 	// Read-only current download rate in byte/s for Freebox services
    public Long bandwidth_up;  		// Read-only available upload bandwidth in bit/s
    public Long bandwidth_down; 	// Read-only available download bandwidth in bit/s
    public Long bytes_up; 			// Read-only total uploaded bytes since last connection
    public Long bytes_down; 		// Read-only total downloaded bytes since last connection
    public Long bytes_up_priv; 		// Read-only total uploaded bytes since last connection for Freebox services
    public Long bytes_down_priv;	// Read-only total downloaded bytes since last connection for Freebox services
    
	public String getState() {
		return state;
	}
	public String getType() {
		return type;
	}
	public String getMedia() {
		return media;
	}
	public String getIpv4() {
		return ipv4;
	}
	public String getIpv6() {
		return ipv6;
	}
	public Long getRate_up() {
		return rate_up;
	}
	public Long getRate_down() {
		return rate_down;
	}
	public Long getRate_up_priv() {
		return rate_up_priv;
	}
	public Long getRate_down_priv() {
		return rate_down_priv;
	}
	public Long getBandwidth_up() {
		return bandwidth_up;
	}
	public Long getBandwidth_down() {
		return bandwidth_down;
	}
	public Long getBytes_up() {
		return bytes_up;
	}
	public Long getBytes_down() {
		return bytes_down;
	}
	public Long getBytes_up_priv() {
		return bytes_up_priv;
	}
	public Long getBytes_down_priv() {
		return bytes_down_priv;
	}
}
