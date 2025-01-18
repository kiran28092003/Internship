package com.abc;
import java.util.List;
import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>(); 
        
   
        books.add(new Book(1, "Java Programming", "Auther 1", 499.00));
        books.add(new Book(2, "Let Me C", "Author 2", 499.00));
        books.add(new Book(3, "Five Point Someone", "chetan bhagat", 399.00));
        books.add(new Book(4, "Java Fundamentals", "Author 4", 599.00));
        books.add(new Book(5, "One Night at the Call Center", "Chetan Bhagat", 459.00));
        
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
