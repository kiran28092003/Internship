package com.abc;

public class ClientClass {
	public static void main(String[]  args)
	{
		faculty f1 = new faculty();
		faculty f2 = new faculty(101,"Aman");
		f1.setId(100);
		f2.setName("Kiran");
		System.out.println("Id is:"+f1.getId());
		System.out.println("Name is:"+f1.getName());
		
		System.out.println("Id is:"+f2.getId());
		System.out.println("Name is:"+f2.getName());
	}
}
