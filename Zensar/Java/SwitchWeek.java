package com.abc;

import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value:");
		int value = sc.nextInt();
		String day = " ";
		switch(value) {
		case 1:day="Monday";
			break;
		case 2:day="Tuesday";
			break;
		case 3:day="Wednesday";
			break;
		case 4:day="Thursday";
			break;
		case 5:day="Friday";
			break;
		case 6:day="Saturday";
			break;
		case 7:day="Sunday";
			break;
		default: System.out.println("Enter valid value...");
	}
		System.out.println(day);
}
}
