package com.abc;
class Book {
    private int id;
    private String title;
    private String author;
    private double price;


    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public int getId() {
        return id;
    }

   
}

public class Books {

    public static void main(String[] args) {
       
        Book[] books = new Book[5];
        books[0] = new Book(1, "five point someone", "chetan bhagat", 499.99);
        books[1] = new Book(2, "Rich Dad Poor Dad", "Robert Kiyosaki", 399.50);
        books[2] = new Book(3, "Atomic Habits", "James Clear", 450.75);
        books[3] = new Book(4, "One night at the call center", "Chetan bhagat", 350.40);
        books[4] = new Book(5, "World war", "kiran", 299.99);

     
        int searchId = 3;
        Book foundBook = getBookById(books, searchId);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book with ID " + searchId + " not found.");
        }
    }

    // Method to retrieve a book by ID
    public static Book getBookById(Book[] books, int id) {
        for (Book book : books) {
            if (book != null && book.getId() == id) {
                return book;
            }
        }
        return null; // Return null if no book with the given ID is found
    }
}
