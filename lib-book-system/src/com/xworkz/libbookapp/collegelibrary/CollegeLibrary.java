package com.xworkz.libbookapp.collegelibrary;
import com.xworkz.libbookapp.book.Book;
import com.xworkz.libbookapp.collectionofbooks.CollectionOfBooks;
import com.xworkz.libbookapp.exception.*;

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
    public Book getBookByBookId(int bookId) throws IdNotFoundException {
        System.out.println("getBookById method started");
        Book isIdFound = null;
        try {

            for (Book book1 : book) {
                if (book1 != null && book1.getBookId() == bookId) {
                    System.out.println(book1);
                }
            }
            if (isIdFound == null) {
                IdNotFoundException idNotFoundException = new IdNotFoundException("Book Id " + bookId + " Not Found");
                throw idNotFoundException;
            }
        }catch (IdNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("getBookById method ended");
//        System.out.println("****************************************");
        return isIdFound;
    }

    @Override
    public Book getBookByAuthor(String bookAuthor)throws BookByAuthorNotFoundException {
        System.out.println("getBookByAuthor method started");
        Book isAuthorFound = null;
        try {
            for (Book book1 : book) {
                if (book1 != null && book1.getBookAuthor() .equals(bookAuthor)) {
                    isAuthorFound = book1;
                    System.out.println("Book Found:");
                    System.out.println(book1);
                }
            }
            if (isAuthorFound ==null) {
                 BookByAuthorNotFoundException bookByAuthorNotFoundException=new BookByAuthorNotFoundException("Author Name Not Found......!");
                throw bookByAuthorNotFoundException;
            }
        } catch (BookByAuthorNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getBookByAuthor method ended");
//        System.out.println("****************************************");
        return isAuthorFound;
    }

    @Override
    public Book getBookByPrice(double price) throws BookByPriceNotFoundException {
        System.out.println("getBookByPrice method started");
        Book isBookFound =null;
        try {
            for (Book book1 :book) {
                if (book1 != null && book1.getPrice() == price) {
                    isBookFound = book1;
                    System.out.println("Book Found:");
                    System.out.println(book1);

                }
            }
            if (isBookFound ==null){
                BookByPriceNotFoundException bookByPriceNotFoundException=new BookByPriceNotFoundException("Book Not found...");
                throw bookByPriceNotFoundException;
            }
        } catch (BookByPriceNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("getBookByPrice method ended");
//        System.out.println("****************************************");
        return isBookFound;
    }



    @Override
    public String getBookNameByid(int id) throws BookNameByidNotFoundException {
        String bookName =null;
        try {
            for (Book book1 :book){
                if ( id != 0 && book1.getBookId()==id){
                    bookName = book1.getBookName();
                    System.out.println("BookName: "+ book1.getBookName());
    //                System.out.println("**************************************");
                }
            }
            if (bookName ==null ) {
                BookNameByidNotFoundException bookNameByidNotFoundException=new BookNameByidNotFoundException("BookId Not found");
                throw bookNameByidNotFoundException;
            }
        } catch (BookNameByidNotFoundException e) {
           e.printStackTrace();
        }
        return bookName;
    }
@Override
    public int getIdByBookName(String bookName) throws IdByBookNameNotFoundException {
        int bookId=0;
    try {
        for (Book book1 :book){
            if(bookName != null && book1.getBookName().equals(bookName)){
                bookId= book1.getBookId();
                System.out.println("BookId: "+ book1.getBookId());
//                System.out.println("**************************************");
            }
        }
        if (bookId==0) {
            IdByBookNameNotFoundException idByBookNameNotFoundException=new IdByBookNameNotFoundException("BookName Not found");
            throw idByBookNameNotFoundException;
        }
    } catch (IdByBookNameNotFoundException e) {
        e.printStackTrace();
    }
    return bookId;
    }


    @Override
    public boolean updateBookAuthorByName(String bookName, String updatedBookAuthor)throws UpdateBookAuthorByNameNotFoundException {
        boolean isBookAuthorUpdated = false;
        try {
            for (Book book1 : book) {
                if (book1.getBookName() .equals(bookName) ) {
                    book1.setBookAuthor(updatedBookAuthor);
                    isBookAuthorUpdated = true;
                }
            }
            if (isBookAuthorUpdated == false) {
                UpdateBookAuthorByNameNotFoundException updateBookAuthorByNameNotFoundException=new UpdateBookAuthorByNameNotFoundException(bookName + "not found");
                throw updateBookAuthorByNameNotFoundException;
            }
        } catch (UpdateBookAuthorByNameNotFoundException e) {
           e.printStackTrace();
        }
        return isBookAuthorUpdated;
    }
//
//    @Override
//    public boolean updatePriceAndBookNameByid(int bookId, double updatedPrice, String updatedBookName) {
//        boolean isPriceAndBookNameUpdated = false;
//        for (Book book1 : book) {
//            if (book1.getBookId() ==bookId) {
//                book1.setPrice(updatedPrice);
//                book1.setBookName(updatedBookName);
//                isPriceAndBookNameUpdated = true;
//            }
//        }
//        if (isPriceAndBookNameUpdated == false)
//            System.out.println(bookId + "not found");
//        return isPriceAndBookNameUpdated;
//    }

    @Override
    public boolean deleteBookById(int bookId)throws DeleteBookByIdNotFoundException {
        boolean isBookDeleted =false;
        int i=0;
        try {
            for (int start=0;start<book.length;start++){
                Book book1 =book[start];
                if (book1.getBookId() != bookId){
                    book[i++]=book[start];
                }else {
                    isBookDeleted =true;
                }
            }
            if (isBookDeleted==false){
                DeleteBookByIdNotFoundException deleteBookByIdNotFoundException=new DeleteBookByIdNotFoundException("Id not found");
                throw deleteBookByIdNotFoundException;
            }
        } catch (DeleteBookByIdNotFoundException e) {
            e.printStackTrace();
        }
        int size=i;
        book= Arrays.copyOf(book,i);
        return isBookDeleted;

    }
}





