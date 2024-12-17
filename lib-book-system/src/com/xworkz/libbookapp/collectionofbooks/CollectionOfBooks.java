package com.xworkz.libbookapp.collectionofbooks;

import com.xworkz.libbookapp.book.Book;

public interface CollectionOfBooks {
    boolean addBook(Book book);

    void getDetails();

    Book getBookByBookId(int bookId);

    Book getBookByAuthor(String bookAuthor);

    Book getBookByPrice(double price);


    String getBookNameByid(int id);

    int getIdByBookName(String bookName);

    double getPriceById(int id);

    String getBookNameByBookAuthor(String author);

    boolean updateBookAuthorByName(String bookName, String updatedBookAuthor);

    boolean updatePriceAndBookNameByid(int bookId, double updatedPrice, String updatedBookName);

    boolean deleteBookById(int bookId);
}
