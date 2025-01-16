package com.abc;

import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Product {
    public static void main(String[] args) {
        // Creating an array of products
        Product[] products = new Product[5];
        products[0] = new Product(101, "Laptop", 50000.0);
        products[1] = new Product(102, "Mobile", 15000.0);
        products[2] = new Product(103, "Headphones", 2000.0);
        products[3] = new Product(104, "Tablet", 25000.0);
        products[4] = new Product(105, "Smartwatch", 5000.0);

        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter product ID to search: ");
        int searchId = scanner.nextInt();


        boolean found = false;
        for (Product product : products) {
            if (product.id == searchId) {
                System.out.println("Product Found: " + product.name);
                System.out.println("Price: " + product.price);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product with ID " + searchId + " not found.");
        }

        scanner.close();
    }
}
