package com.abc;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an operation to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double areaCircle = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + areaCircle);
                break;

            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                double areaRectangle = length * breadth;
                System.out.println("Area of the rectangle: " + areaRectangle);
                break;

            case 3: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of the triangle: " + areaTriangle);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
        
        scanner.close();
    }
}
