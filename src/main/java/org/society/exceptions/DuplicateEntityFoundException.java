package org.society.exceptions;

public class DuplicateEntityFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DuplicateEntityFoundException(String msg) {
		super(msg);
	}
}
