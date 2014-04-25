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

import org.matmaul.freeboxos.FreeboxException;
import org.matmaul.freeboxos.internal.RestManager;

public class SystemManager {
	protected RestManager restManager;

	public SystemManager(RestManager restManager) {
		this.restManager = restManager;
	}

	public SystemConfiguration getConfiguration() throws FreeboxException {
		return restManager.get("system/", SystemResponses.SystemConfigurationResponse.class);
	}
	
	public SystemReboot Reboot() throws FreeboxException  {	// pas testé !
		SystemReboot reboot = new SystemReboot();
		return restManager.put("system/reboot/", restManager.createJsonEntity(reboot), SystemResponses.SystemRebootResponse.class);
	}

}
