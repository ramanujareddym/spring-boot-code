package com.rama.springboot.sample.exception;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = -2924855511579167351L;

	public UserServiceException(String message) {
		super(message);
	}
}
