package com.niit.exceptions;

public class MyException extends Exception {
	private static final long serialVersionUID = 3053353545658978402L;
	private String errorCode="Unknown_Exception";
	private Throwable e = null; 
	private String message = "Unknown Message";
	public MyException() { 
		super(); 
	}
	public MyException(Throwable e){ 
		super(e) ; 
		this.e = e; 
	}
	public MyException(Throwable e, String message){ 
		super(e) ; 
		this.e = e; 
		this.message = message; 
	}

	public MyException(String message, String errorCode){
		super(message);
		this.message = message; 
		this.errorCode=errorCode;
	}
	
	public String getErrorCode(){
		return this.errorCode;
	}
	public String getMessage() { 
		return this.message; 
	}
}
