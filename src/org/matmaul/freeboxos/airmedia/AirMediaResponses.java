package org.matmaul.freeboxos.airmedia;

import java.util.List;

import org.matmaul.freeboxos.internal.Response;

public class AirMediaResponses {
	public static class AirMediaConfigResponse extends Response<AirMediaConfig> {}
	public static class AirMediaReceiversResponse extends Response<List<AirMediaReceiver>> {}
}
