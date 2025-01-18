package com.abc;

import java.util.Scanner;

public class LoopDem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the the value..");
		int num = sc.nextInt();
		//print numbers using while
		int i = 0;
		while(i<=num) {
			System.out.println(i);
//			System.out.print(i);
			i++;
	}
		//print reverse using do while
		int i2 =num;
		do {
			System.out.print(i2+" ");
			i2--;
		}while(i2>=1);
		//print values using for loop
		for(int k=1;k<=num;k++)
		{
			System.out.print("\nCube of"+k+"is:"+k*k*k);
		}
		//to print reverse
		for(int j=num;j>=1;j--)
		{
			System.out.print("\nCube of"+j+"is:"+j*j*j);
			System.out.println();
		}
}
}
