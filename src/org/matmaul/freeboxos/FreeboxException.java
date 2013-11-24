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

/**
 * @author matmaul
 *
 */
public class FreeboxException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5403009193715290205L;
	protected String errorCode;

	/**
	 * 
	 */
	public FreeboxException(String errorCode, String msg) {
		super(msg);
		this.errorCode = errorCode;
	}
	
	/**
	 * 
	 */
	public FreeboxException(Throwable t) {
		super(t);
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
}
