package br.com.chronos.utils.exceptions;

public class NotFoundException extends RuntimeException{

	public NotFoundException() {
		super("NotFoundException");
	}
	
	public NotFoundException(String message) {
		super(message);
	}
}
