package com.tech.customer.exception;

public class NoBodyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String code = "USER-001";
	public NoBodyException(String message) {
		super(message);
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
