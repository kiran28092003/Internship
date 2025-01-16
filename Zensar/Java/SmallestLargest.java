package com.abc;

public class SmallestLargest {
    public static void main(String[] args) {
        int[] array = {12, 7, 19, 4, 18, 5, 24, 9, 8, 2};

        int smallest = array[0];
        int largest = array[0];

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        // Output the results
        System.out.println("Smallest element in the array: " + smallest);
        System.out.println("Largest element in the array: " + largest);
    }
}
