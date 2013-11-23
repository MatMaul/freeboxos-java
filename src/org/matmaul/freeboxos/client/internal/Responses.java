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
package org.matmaul.freeboxos.client.internal;

import java.util.List;

import org.matmaul.freeboxos.client.Authorize;
import org.matmaul.freeboxos.client.fs.FileInfo;
import org.matmaul.freeboxos.client.fs.FileUpload;
import org.matmaul.freeboxos.client.fs.FsTask;

/**
 * @author matmaul
 *
 */
public class Responses {
	public static class ChallengeResponse extends Response<Challenge> {}
	public static class SessionResponse extends Response<Session> {}
	public static class TrackAuthorizeResponse extends Response<TrackAuthorize> {}
	public static class AuthorizeResponse extends Response<Authorize> {}
	public static class FileInfosResponse extends Response<List<FileInfo>> {}
	public static class FileInfoResponse extends Response<FileInfo> {}
	public static class IdHolderResponse extends Response<IdHolder> {}
	public static class FileUploadsResponse extends Response<List<FileUpload>> {}
	public static class FileUploadResponse extends Response<FileUpload> {}
	public static class FsTasksResponse extends Response<List<FsTask>> {}
	public static class FsTaskResponse extends Response<FsTask> {}
}
