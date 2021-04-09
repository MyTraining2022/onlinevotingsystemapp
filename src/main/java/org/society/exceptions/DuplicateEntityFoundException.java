package org.society.exceptions;

public class DuplicateEntityFoundException extends RuntimeException {
	
	public DuplicateEntityFoundException(String msg) {
		super(msg);
	}
}
