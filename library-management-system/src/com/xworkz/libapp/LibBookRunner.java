package com.xworkz.libapp;

import com.xworkz.libapp.book.Book;
import com.xworkz.libapp.library.CollegeLibrary;

public class LibBookRunner {
    public static  void main(String[] args){
        CollegeLibrary collegeLibrary=new CollegeLibrary();
        Book book=new Book();
        book.setBookId(101);
        book.setBookAuthor("Sadhguru");
        book.setBookName("Death");
        book.setPrice(222.99);

        collegeLibrary.addBook(book);
        collegeLibrary.getDetails();
    }
}
