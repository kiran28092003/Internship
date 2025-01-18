package com.abc;

public class ArrayIndexOBEDemo {

	public static void main(String[] args) {
		//String str = "java";
		//int arr[]= {10,29,36,40,56};
		String str[]= {"kiran","vrush","prachi","Shubh","tanishka"};
		try {
		//System.out.println(arr[10]);
		System.out.println(str[10]);
//		}catch(ArrayIndexOutOfBoundsException aiobe)
//		{
//			System.out.println(aiobe.getMessage());
//			//System.out.println(aiobe.toString());
//			//aiobe.printStackTrace();
//		
//		}
		catch(StringIndexOutOfBoundsException siobe)
		{
			System.out.println(aiobe.getMessage());
			//System.out.println(aiobe.toString());
			//aiobe.printStackTrace();
		
		}finally {
			System.out.println("Finally block always executed..");
		}
	}


}
