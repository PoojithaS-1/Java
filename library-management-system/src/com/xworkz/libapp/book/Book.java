package com.xworkz.libapp.book;

public class Book {
    private int bookId;
    private String bookAuthor;
    private String bookName;
    private double price;

    public Book(){
        System.out.println("Book constructor invoked");
    }

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
//    @Override
//    public String toString(){
//        return "Book-bookId= "+this.bookId+","+
//                "bookAuthor= "+this.bookAuthor+","+
//                "bookName= "+this.bookName+","+
//                "price= "+this.price;
//    }
    @Override
    public int hashCode(){
        return this.bookId;
    }
    @Override
    public boolean equals(Object obj){
        Book book=(Book)obj;
        if (this.hashCode()==book.hashCode() )
            return true;

        return false;
    }
}
