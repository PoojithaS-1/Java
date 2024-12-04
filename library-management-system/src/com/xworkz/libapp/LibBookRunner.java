package com.xworkz.libapp;

import com.xworkz.libapp.book.Book;
import com.xworkz.libapp.library.CollegeLibrary;

public class LibBookRunner {
    public static  void main(String[] args){
        CollegeLibrary collegeLibrary=new CollegeLibrary();
        Book book=new Book();
        System.out.println(book);
        book.setBookId(101);
        book.setBookAuthor("Sadhguru");
        book.setBookName("Death");
        book.setPrice(222.99);
        System.out.println(book);

        collegeLibrary.addBook(book);
        collegeLibrary.getDetails();
    }
}
