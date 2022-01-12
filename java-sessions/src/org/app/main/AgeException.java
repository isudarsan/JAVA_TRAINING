package org.app.main;



/*class Exception {
	
	private String message;
	
	public Exception(String message) {
			this.message = message;
	}
	
	
	public String getMessage() {
		return message;
	}
	
}*/



public class AgeException extends Exception{
	
	public AgeException(String message) {
		super(message);
	}
	
	
}
