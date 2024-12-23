package com.xworkz.collectionmethods.runnercustomtype1;

public class Book {
    private String book_name;
    private int book_id;

    public Book(String book_name, int book_id) {
        this.book_name = book_name;
        this.book_id = book_id;
    }

    public String getName() {
        return book_name;
    }

    public int getBook_id() {
        return book_id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book-name='" + book_name + '\'' +
                ", Book-id=" + book_id +
                '}';
    }
}
