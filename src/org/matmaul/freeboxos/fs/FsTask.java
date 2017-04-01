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
package org.matmaul.freeboxos.fs;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class FsTask {
	protected Long id;
	protected Long created_ts;
	protected Long started_ts;
	protected Long done_ts;
	protected Integer duration;
	protected Integer progress;
	protected Integer eta;
	protected String type;
	protected String state;
	protected String error;
	protected String from;
	protected String to;
	protected Integer nfiles;
	protected Integer nfiles_done;
	protected Long total_bytes;
	protected Long total_bytes_done;
	protected Long curr_bytes;
	protected Long curr_bytes_done;
	protected Long rate;

	public Long getId() {
		return id;
	}

	public Long getCreatedTimestamp() {
		return created_ts;
	}

	public Long getStartedTimestamp() {
		return started_ts;
	}

	public Long getDoneTimestamp() {
		return done_ts;
	}

	public Integer getDuration() {
		return duration;
	}

	public Integer getProgress() {
		return progress;
	}

	public Integer getEta() {
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

	public String getTo() {
		return to;
	}

	public Integer getNfiles() {
		return nfiles;
	}

	public Integer getNfilesDone() {
		return nfiles_done;
	}

	public Long getTotalBytes() {
		return total_bytes;
	}

	public Long getTotalBytesDone() {
		return total_bytes_done;
	}

	public Long getCurrentBytes() {
		return curr_bytes;
	}

	public Long getCurrentBytesDone() {
		return curr_bytes_done;
	}

	public Long getRate() {
		return rate;
	}
}
