package com.abc;

import java.util.Scanner;

public class Kth_Element {
    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15,29,45,67,88};
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value of k
        System.out.print("Enter the value of k (1 to " + array.length + "): ");
        int k = scanner.nextInt();

        // Validate the value of k
        if (k >= 1 && k <= array.length) {
            System.out.println("The " + k + "-th element in the array is: " + array[k - 1]);
        } else {
            System.out.println("Invalid value of k. Please ensure 1 <= k <= " + array.length);
        }

        scanner.close();
    }
}
