package com.abc;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		System.out.println("Please Enter The Weight of Your Product");
		Scanner sc = new Scanner(System.in);
		int prod_weight = sc.nextInt();
		if(prod_weight<50) {
			throw new InvalidProductException("the product is not valid");
		}
		else {
			System.out.println("100% valid Product");
		}
	}

}
