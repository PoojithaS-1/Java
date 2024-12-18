package com.xworkz.libbookapp.collectionofbooks;

import com.xworkz.libbookapp.book.Book;
import com.xworkz.libbookapp.exception.*;

public interface CollectionOfBooks {
    boolean addBook(Book book);

    void getDetails();

    Book getBookByBookId(int bookId) throws IdNotFoundException;

    Book getBookByAuthor(String bookAuthor)throws BookByAuthorNotFoundException, BookByAuthorNotFoundException;

    Book getBookByPrice(double price) throws BookByPriceNotFoundException;


    String getBookNameByid(int id) throws BookNameByidNotFoundException;

    int getIdByBookName(String bookName) throws IdByBookNameNotFoundException;

//    double getPriceById(int id);
//
//    String getBookNameByBookAuthor(String author);
//
//    boolean updateBookAuthorByName(String bookName, String updatedBookAuthor);
//
//    boolean updatePriceAndBookNameByid(int bookId, double updatedPrice, String updatedBookName);

    boolean updateBookAuthorByName(String bookName, String updatedBookAuthor) throws UpdateBookAuthorByNameNotFoundException;

    boolean deleteBookById(int bookId) throws DeleteBookByIdNotFoundException;


}
