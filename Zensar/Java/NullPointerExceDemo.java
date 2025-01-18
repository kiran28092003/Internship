package com.abc;

public class NullPointerExceDemo {

	public static void main(String[] args) {
		//String str = "java";
		String str = null;
		try {
		System.out.println(str.length());
		}catch(NullPointerException npe)
		{
			System.out.println(npe.getMessage());
			System.out.println(npe.toString());
			npe.printStackTrace();
		}
		finally {
			System.out.println("Finally block always executed..");
		}
	}

}
