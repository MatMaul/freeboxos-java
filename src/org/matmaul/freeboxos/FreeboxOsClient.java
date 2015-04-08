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
package org.matmaul.freeboxos;

import org.matmaul.freeboxos.connection.ConnectionManager;
import org.matmaul.freeboxos.phone.PhoneManager;
import org.matmaul.freeboxos.system.SystemManager;
import org.matmaul.freeboxos.fs.FsManager;
import org.matmaul.freeboxos.internal.RestManager;
import org.matmaul.freeboxos.login.LoginManager;
import org.matmaul.freeboxos.call.CallManager;
import org.matmaul.freeboxos.wifi.WifiManager;
import org.matmaul.freeboxos.lcd.LCDManager;


/**
 * @author matmaul
 * 
 */
public class FreeboxOsClient {
	protected FsManager fsManager;
	protected RestManager restManager;
	protected LoginManager loginManager;
	protected ConnectionManager connectionManager;
	protected SystemManager systemManager;
	protected CallManager callManager;
	protected WifiManager wifiManager;
	protected LCDManager lcdManager;
	protected PhoneManager phoneManager;

	public FreeboxOsClient(String appId) {
		this(appId, "mafreebox.freebox.fr");
	}

	public FreeboxOsClient(String appId, String host) {
		restManager = new RestManager(this, host);
		loginManager = new LoginManager(appId, restManager);
		restManager.setLoginManager(loginManager);
		fsManager = new FsManager(restManager);
		connectionManager = new ConnectionManager(restManager);
		systemManager = new SystemManager(restManager);
		callManager = new CallManager(restManager);
		wifiManager = new WifiManager(restManager);
		lcdManager = new LCDManager(restManager);
		phoneManager = new PhoneManager(restManager);
	}

	public LoginManager getLoginManager() {
		return loginManager;
	}

	public RestManager getRestManager() {
		return restManager;
	}

	public FsManager getFsManager() {
		return fsManager;
	}

	public ConnectionManager getConnectionManager() {
		return connectionManager;
	}
	
	public SystemManager getSystemManager() {
		return systemManager;
	}
	
	public CallManager getCallManager() {
		return callManager;
	}
	
	public WifiManager getWifiManager() {
		return wifiManager;
	}
	
	public LCDManager getLCDManager() {
		return lcdManager;
	}
	
	public PhoneManager getPhoneManager() {
		return phoneManager;
	}

}
