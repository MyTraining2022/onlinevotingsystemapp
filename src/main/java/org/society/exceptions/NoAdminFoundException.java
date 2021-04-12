package org.society.exceptions;

public class NoAdminFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String operation;

	public NoAdminFoundException(String operation,String message) {
		super(message);
		this.operation = operation;
		
	}
	
	public String getMessage() {
		return operation;
	}

}
