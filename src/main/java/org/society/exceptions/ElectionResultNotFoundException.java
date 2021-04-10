package org.society.exceptions;

public class ElectionResultNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ElectionResultNotFoundException(String msg) {
		super(msg);
	}
}
