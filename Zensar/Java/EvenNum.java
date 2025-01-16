package com.abc;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Even numbers in the array are:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
