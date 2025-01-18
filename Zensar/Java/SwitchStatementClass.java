package com.abc;

import java.util.Scanner;

public class SwitchStatementClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value:");
		int value = sc.nextInt();
		String day = null;
		switch(value) {
		case 1:day="First day";
			break;
		case 2:day="second day";
			break;
		case 3:day="third day";
			break;
		default: System.out.println("Enter valid value...");
		}

	}

}
