package org.society.exceptions;

public class ElectionResultNotFoundException extends RuntimeException{
	public ElectionResultNotFoundException(String msg) {
		super(msg);
	}
}
