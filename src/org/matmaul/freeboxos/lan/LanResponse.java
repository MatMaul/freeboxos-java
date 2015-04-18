package org.matmaul.freeboxos.lan;

import java.util.List;

import org.matmaul.freeboxos.internal.Response;

public class LanResponse {
	public static class LanConfigResponse extends Response<LanConfig> {}
	public static class LanInterfacesResponse extends Response<List<LanInterface>> {}
	public static class LanHostConfigResponse extends Response<LanHostConfig> {}
	public static class LanHostsConfigResponse extends Response<List<LanHostConfig>> {}
	public static class WakeOnLanResponse extends Response<WakeOnLan> {}
}
