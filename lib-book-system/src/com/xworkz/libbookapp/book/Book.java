package com.xworkz.libbookapp.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Book {
    private int bookId;
    private String bookAuthor;
    private String bookName;
    private double price;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return "Book-bookId= "+this.bookId+","+
                "bookAuthor= "+this.bookAuthor+","+
                "bookName= "+this.bookName+","+
                "price= "+this.price;
    }
}