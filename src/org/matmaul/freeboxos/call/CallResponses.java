package org.matmaul.freeboxos.call;

import java.util.List;

import org.matmaul.freeboxos.internal.Response;

public class CallResponses {
	public static class CallEntriesResponse extends Response<List<CallEntry>> {
	}

	public static class CallEntryResponse extends Response<CallEntry> {
	}
}
