package com.abc;
//User defined exception
public class InvalidProductException extends RuntimeException{
	public InvalidProductException(String msg) {
		super("msg");
	}
}
