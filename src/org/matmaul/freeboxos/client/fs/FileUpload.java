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
public class FileUpload {
	protected long id;
	protected long size;
	protected long uploaded;
	protected long start_date;
	protected long last_update;
	protected String status;
	protected String dirname;
	protected String upload_name;
	
	public long getId() {
		return id;
	}
	
	public long getLastUpdate() {
		return last_update;
	}
	
	public String getDirname() {
		return dirname;
	}
	
	public long getStartDate() {
		return start_date;
	}
	
	public String getUploadName() {
		return upload_name;
	}
	
	public long getUploaded() {
		return uploaded;
	}
	
	public long getSize() {
		return size;
	}
	
	public String getStatus() {
		return status;
	}
}
