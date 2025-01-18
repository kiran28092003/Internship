package com.abc;

public class ExplicitExceptionDemo {

	public static void main(String[] args) {
		int result=0;
		int p=10;
		result=p/2;
		System.out.println("Result is:"+result);
		throw new ArithmeticException("/by zero Exception");
	}

}
