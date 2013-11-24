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
package org.matmaul.freeboxos.internal;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.matmaul.freeboxos.FreeboxException;

/**
 * @author matmaul
 *
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Response<T> {
	protected boolean success;
	protected String error_code;
	protected String uid;
	protected String msg;
	protected T result;

	/**
	 * @return the result
	 * @throws FreeboxException 
	 */
	public T getResult() {
		return result;
	}

	public void evaluate() throws FreeboxException {
		if (!isSuccess()) {
			throw new FreeboxException(getErrorCode(), getMsg());
		}
	}

	public String getUid() {
		return uid;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @return the error_code
	 */
	public String getErrorCode() {
		return error_code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	public static class StringResponse extends Response<String> {}

	public static class EmptyResponse extends Response<Object> {}
}
