package com.xworkz.libbookapp.collegelibrary;
import com.xworkz.libbookapp.book.Book;
import com.xworkz.libbookapp.collectionofbooks.CollectionOfBooks;

import java.util.Arrays;

public class CollegeLibrary implements CollectionOfBooks {
    Book book[] = null;
    int index = 0;

    public CollegeLibrary(int size) {

        book = new Book[size];
    }

    @Override
    public boolean addBook(Book book) {
        if (index < this.book.length) {
            if (book.getBookId() > 0 && book.getBookAuthor() != null &&book.getBookName() != null) {
                this.book[index++] = book;
                System.out.println("Book added successfully");
                return true;

            } else {
                System.out.println("Invalid book details.");
                return false;
            }
        } else {
            System.out.println("ArrayIndexOutOfBoundsException: Book array is full.");
            return false;
        }
    }

        @Override
    public void getDetails(){
        System.out.println("Book Info: ");
        for (Book book1 : book){
            if (book1 != null){
                System.out.println(book1);
            }else {
                System.out.println("Not Available");
            }
        }
    }
    @Override
    public Book getBookByBookId(int bookId) {
        System.out.println("getBookById method started");
        Book isIdFound = null;
        for (Book book1 : book) {
            if (book1 != null && book1.getBookId()== bookId) {
                System.out.println(book1);
            }
        }
        System.out.println("getBookById method ended");
//        System.out.println("****************************************");
        return isIdFound;
    }

    @Override
    public Book getBookByAuthor(String bookAuthor) {
        System.out.println("getBookByAuthor method started");
        Book isAuthorFound = null;
        for (Book book1 : book) {
            if (book1 != null && book1.getBookAuthor() .equals(bookAuthor)) {
                isAuthorFound = book1;
                System.out.println("Book Found:");
                System.out.println(book1);
            }
        }
        if (isAuthorFound ==null) {
            System.out.println("Author Name Not Found......!");
        }
        System.out.println("getBookByAuthor method ended");
//        System.out.println("****************************************");
        return isAuthorFound;
    }

    @Override
    public Book getBookByPrice(double price) {
        System.out.println("getBookByPrice method started");
        Book isBookFound =null;
        for (Book book1 :book) {
            if (book1 != null && book1.getPrice() == price) {
                isBookFound = book1;
                System.out.println("Book Found:");
                System.out.println(book1);

            }
        }
        if (isBookFound ==null){
            System.out.println("Book Not found...");
        }
        System.out.println("getBookByPrice method ended");
//        System.out.println("****************************************");
        return isBookFound;
    }



    @Override
    public String getBookNameByid(int id) {
        String bookName =null;
        for (Book book1 :book){
            if ( id != 0 && book1.getBookId()==id){
                bookName = book1.getBookName();
                System.out.println("BookName: "+ book1.getBookName());
//                System.out.println("**************************************");
            }
        }
        if (bookName ==null )
            System.out.println("BookId Not found");
        return bookName;
    }
@Override
    public int getIdByBookName(String bookName) {
        int bookId=0;
        for (Book book1 :book){
            if(bookName != null && book1.getBookName().equals(bookName)){
                bookId= book1.getBookId();
                System.out.println("BookId: "+ book1.getBookId());
//                System.out.println("**************************************");
            }
        }
        if (bookId==0)
            System.out.println("BookName Not found");
        return bookId;
    }
@Override
    public double getPriceById(int id) {
        double price =0.0;
        for (Book book1 :book){
            if (id != 0 && book1.getBookId()==id){
                price = book1.getPrice();
                System.out.println("Price: "+ book1.getPrice());
            }
        }if (price == 0.0)
            System.out.println("Id Not found");
        return price;
    }

    @Override
    public String getBookNameByBookAuthor(String author) {
        String bookName=null;
        for (Book book1 :book){
            if(author != null && book1.getBookAuthor().equals(author)){
                bookName= book1.getBookName();
                System.out.println("Book name: "+ book1.getBookName());
            }
        }
        if (bookName == null)
            System.out.println("author Not found");
        return bookName;
    }

    @Override
    public boolean updateBookAuthorByName(String bookName, String updatedBookAuthor) {
        boolean isBookAuthorUpdated = false;
        for (Book book1 : book) {
            if (book1.getBookName() .equals(bookName) ) {
                book1.setBookAuthor(updatedBookAuthor);
                isBookAuthorUpdated = true;
            }
        }
        if (isBookAuthorUpdated == false)
            System.out.println(bookName + "not found");
        return isBookAuthorUpdated;
    }

    @Override
    public boolean updatePriceAndBookNameByid(int bookId, double updatedPrice, String updatedBookName) {
        boolean isPriceAndBookNameUpdated = false;
        for (Book book1 : book) {
            if (book1.getBookId() ==bookId) {
                book1.setPrice(updatedPrice);
                book1.setBookName(updatedBookName);
                isPriceAndBookNameUpdated = true;
            }
        }
        if (isPriceAndBookNameUpdated == false)
            System.out.println(bookId + "not found");
        return isPriceAndBookNameUpdated;
    }

    @Override
    public boolean deleteBookById(int bookId) {
        boolean isBookDeleted =false;
        int i=0;
        for (int start=0;start<book.length;start++){
            Book book1 =book[start];
            if (book1.getBookId() != bookId){
                book[i++]=book[start];
            }else {
                isBookDeleted =true;
            }
        }
        int size=i;
        book= Arrays.copyOf(book,i);
        return isBookDeleted;

    }
}





