package com.abc;

public class MultipleCatch {

	public static void main(String[] args) {
		int k=0;
		int result=0;
		try {
		result=10/k;
		System.out.println("Result : "+result);
		}catch(ArithmeticException ae) {
			//ae.printStackTrace(); //use to display which kind of exception raised
			System.out.println("Number should not divide by zero");
		}
		catch(Exception e) {
			//e.printStackTrace(); //use to display which kind of exception raised
			System.out.println("Broader range exception..any type of exception can be handel by Exception type ");
		}
	}

}
