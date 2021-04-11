package org.society.exceptions;

public class NoAdminFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public NoAdminFoundException(String msg) {
		super(msg);
	}
}
