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
package org.matmaul.freeboxos.client.fs;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class FsTask {
	protected long id;
	protected long created_ts;
	protected long started_ts;
	protected long done_ts;
	protected int duration;
	protected int progress;
	protected int eta;
	protected String type;
	protected String state;
	protected String error;
	protected String from;
	protected int nfiles;
	protected int nfiles_done;
	protected long total_bytes;
	protected long total_bytes_done;
	protected long curr_bytes;
	protected long curr_bytes_done;
	
	public long getId() {
		return id;
	}
	public long getCreatedTimestamp() {
		return created_ts;
	}
	public long getStartedTimestamp() {
		return started_ts;
	}
	public long getDoneTimestamp() {
		return done_ts;
	}
	public int getDuration() {
		return duration;
	}
	public int getProgress() {
		return progress;
	}
	public int getEta() {
		return eta;
	}
	public String getType() {
		return type;
	}
	public String getState() {
		return state;
	}
	public String getError() {
		return error;
	}
	public String getFrom() {
		return from;
	}
	public int getNfiles() {
		return nfiles;
	}
	public int getNfilesDone() {
		return nfiles_done;
	}
	public long getTotalBytes() {
		return total_bytes;
	}
	public long getTotalBytesDone() {
		return total_bytes_done;
	}
	public long getCurrentBytes() {
		return curr_bytes;
	}
	public long getCurrentBytesDone() {
		return curr_bytes_done;
	}
}
