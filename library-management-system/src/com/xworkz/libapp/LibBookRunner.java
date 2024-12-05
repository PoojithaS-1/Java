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
        System.out.println(book.hashCode());

        Book book1 =new Book();
        System.out.println(book1);
        book1.setBookId(101);
        book1.setBookAuthor("Sadhguru");
        book1.setBookName("Death");
        book1.setPrice(222.99);
        System.out.println(book1.hashCode());

        collegeLibrary.addBook(book1);
//        collegeLibrary.getDetails();

        boolean same=book.equals(book1);
        System.out.println(same);
    }

}

