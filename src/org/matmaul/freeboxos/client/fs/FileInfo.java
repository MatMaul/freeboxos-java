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

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.matmaul.freeboxos.client.FreeboxException;
import org.matmaul.freeboxos.client.internal.ActiveBean;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;


/**
 * @author matmaul
 *
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class FileInfo extends ActiveBean {
	
    protected String type;
    protected boolean link;
    protected boolean hidden;
    protected String parent;
    protected String mimetype;
    protected String name;
    protected String target;
    protected String path;
    protected long modification;
    protected long size;
    protected long index;
    
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the link
	 */
	public boolean isLink() {
		return link;
	}

	/**
	 * @return the hidden
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * @return the parent
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * @return the mimetype
	 */
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @return the modification
	 */
	public long getModification() {
		return modification;
	}

	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * @return the index
	 */
	public long getIndex() {
		return index;
	}
	
	public static FileInfo create(String path) {
		FileInfo fi = new FileInfo();
		fi.path = encodePath(path);
		return fi;
	}
	
	public Map<String, FileInfo> ls() throws FreeboxException {
		return client.getFsManager().ls(this);
	}
	
	public InputStream download() throws FreeboxException {
		return client.getFsManager().download(this);
	}

	public static Collection<FileInfo> createList(Collection<String> paths) {
		return Collections2.transform(paths, new Function<String, FileInfo>() {

			public FileInfo apply(String path) {
				return create(path);
			}
		});
	}

	public static String encodePath(String path) {
		return Base64.encodeBase64String(path.getBytes(Charset.forName("UTF-8")));
	}
}
