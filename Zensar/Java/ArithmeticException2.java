package com.abc;

import java.util.Scanner;

public class ArithmeticException2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        int result = 0;

        try {
            System.out.print("Enter a number to divide 10: ");
            k = scanner.nextInt();
            result = 10 / k;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Number should not divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
