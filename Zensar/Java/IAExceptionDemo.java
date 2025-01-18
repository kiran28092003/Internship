package com.abc;

public class IAExceptionDemo {
	//IllegalArgumentException
	public static void main(String[] args){
		try {
		Thread t = new Thread();
		//priority of thread 1 to 10
		t.setPriority(10);
		t.setPriority(15);
		}catch(IllegalArgumentException iae) {
		System.out.println("done");
		System.out.println(iae.getMessage());
		System.out.println(iae.toString());
		iae.printStackTrace();
		}
	}

}
