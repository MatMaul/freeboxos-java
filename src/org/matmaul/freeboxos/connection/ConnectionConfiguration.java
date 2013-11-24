/*
 * Copyright (c) 2013, Mathieu Velten. All rights reserved.
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
public class ConnectionConfiguration {
	protected Boolean ping;
	protected Boolean is_secure_pass;
	protected Boolean remote_access;
	protected Integer remote_access_port;
	protected String remote_access_ip;
	protected Boolean api_remote_access;
	protected Boolean wol;
	protected Boolean adblock;
	protected Boolean adblock_not_set;
	protected Boolean allow_token_request;

	public Boolean isPing() {
		return ping;
	}

	public void setPing(Boolean ping) {
		this.ping = ping;
	}

	public Boolean isSecurePass() {
		return is_secure_pass;
	}

	public Boolean isRemoteAccess() {
		return remote_access;
	}

	public Integer getRemoteAccessPort() {
		return remote_access_port;
	}

	public String getRemoteAccessIp() {
		return remote_access_ip;
	}

	public Boolean isApiRemoteAccess() {
		return api_remote_access;
	}

	public Boolean isWol() {
		return wol;
	}

	public void setWol(Boolean wol) {
		this.wol = wol;
	}

	public Boolean isAdblock() {
		return adblock;
	}

	public Boolean isAdblockNotSet() {
		return adblock_not_set;
	}

	public Boolean isAllowTokenRequest() {
		return allow_token_request;
	}
}
