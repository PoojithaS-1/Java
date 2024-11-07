package com.xworkz.libapp.library;

import com.xworkz.libapp.book.Book;

public class CollegeLibrary {
    Book book;
    public boolean addBook(Book book){
        boolean isAdded = false;
        if(book != null){
            if(book.getBookId()>0 && book.getBookName() !=null){
                this.book=book;
                isAdded=true;
            }else{
                System.out.println("Book Name is null");
            }
        }
        return isAdded;
    }
    public void getDetails(){
        System.out.println("Book id: "+book.getBookId());
        System.out.println("Book Name: " +book.getBookName());
        System.out.println("Book author: "+book.getBookAuthor());
        System.out.println("Book Price: "+book.getPrice());
    }

}
