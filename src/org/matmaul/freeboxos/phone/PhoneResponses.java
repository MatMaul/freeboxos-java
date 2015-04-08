package org.matmaul.freeboxos.phone;

import java.util.List;

import org.matmaul.freeboxos.internal.Response;
import org.matmaul.freeboxos.phone.PhoneConfig;

public class PhoneResponses {
	public static class PhoneConfigResponse extends Response<PhoneConfig> {}
	public static class PhoneStatusResponse extends Response<List<PhoneStatus>> {}
}