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
	protected boolean ping;
	protected boolean is_secure_pass;
	protected boolean remote_access;
	protected int remote_access_port;
	protected String remote_access_ip;
	protected boolean api_remote_access;
	protected boolean wol;
	protected boolean adblock;
	protected boolean adblock_not_set;
	protected boolean allow_token_request;

	public boolean isPing() {
		return ping;
	}

	public boolean isSecurePass() {
		return is_secure_pass;
	}

	public boolean isRemoteAccess() {
		return remote_access;
	}

	public int getRemoteAccessPort() {
		return remote_access_port;
	}

	public String getRemoteAccessIp() {
		return remote_access_ip;
	}

	public boolean isApiRemoteAccess() {
		return api_remote_access;
	}

	public boolean isWol() {
		return wol;
	}

	public boolean isAdblock() {
		return adblock;
	}

	public boolean isAdblockNotSet() {
		return adblock_not_set;
	}

	public boolean isAllowTokenRequest() {
		return allow_token_request;
	}
}
