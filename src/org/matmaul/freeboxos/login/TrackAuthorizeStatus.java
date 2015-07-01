package org.matmaul.freeboxos.login;

public enum TrackAuthorizeStatus {
	UNKNOWN,	// the app_token is invalid or has been revoked
	PENDING,	// the user has not confirmed the autorization request yet
	TIMEOUT,	// the user did not confirmed the authorization within the given time
	GRANTED,	// the app_token is valid and can be used to open a session
	DENIED;		// the user denied the authorization request
}
