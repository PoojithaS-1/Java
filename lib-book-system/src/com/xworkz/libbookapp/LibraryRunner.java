package com.xworkz.libbookapp;

import com.xworkz.libbookapp.book.Book;
import com.xworkz.libbookapp.collegelibrary.CollegeLibrary;
import com.xworkz.libbookapp.exception.*;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) throws IdNotFoundException, BookByPriceNotFoundException, BookNameByidNotFoundException, IdByBookNameNotFoundException, BookByAuthorNotFoundException, DeleteBookByIdNotFoundException, UpdateBookAuthorByNameNotFoundException {
        System.out.println("Main Started");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of books to be added: ");
        int size=scanner.nextInt();
        CollegeLibrary collegeLibrary=new CollegeLibrary(size);
        for (int i=0;i<size;i++){
            Book book=new Book();
            System.out.println("Enter BookId: ");
            book.setBookId(scanner.nextInt());
            System.out.println("Enter Book Name: ");
            book.setBookName(scanner.next());
            System.out.println("Enter Book Author: ");
            book.setBookAuthor(scanner.next());
            System.out.println("Book Price: ");
            book.setPrice(scanner.nextDouble());
            collegeLibrary.addBook(book);
        }
        String input=null;
        do {
            System.out.println("1.get details of book");
            System.out.println("2.get Book By BookId");
            System.out.println("3.get Book By Author");
            System.out.println("4.get Book By Price");
            System.out.println("5.get BookName By id");
            System.out.println("6.get BookId By BookName");
            System.out.println("7.update BookAuthor By BookName");
            System.out.println("8.delete Book By Id");
            int option=scanner.nextInt();
            switch (option){
                case 1:
                    collegeLibrary.getDetails();
                    break;
                case 2:
                    System.out.println("Enter the BookId: ");
                    collegeLibrary.getBookByBookId(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter authorName: ");
                    collegeLibrary.getBookByAuthor(scanner.next());
                    break;
                case 4:
                    System.out.println("Enter the Price: ");
                    collegeLibrary.getBookByPrice(scanner.nextDouble());
                    break;

                case 5:
                    System.out.println("Enter the BookId: ");
                    collegeLibrary.getBookNameByid(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Enter the bookName");
                    collegeLibrary.getIdByBookName(scanner.next());
                    break;
//
                case 7:
                    System.out.println("Enter BookAuthor to be updated: ");
                    String updatedBookAuthor=scanner.next();
                    System.out.println("Enter bookName: ");
                    String bookName=scanner.next();
                    collegeLibrary.getDetails();
                    collegeLibrary.updateBookAuthorByName(bookName,updatedBookAuthor);
                    collegeLibrary.getDetails();
                    break;
//
                case 8:
                    System.out.println("Enter bookId to be deleted: ");
                    collegeLibrary.deleteBookById(scanner.nextInt());
                    System.out.println("Deleted successfully...!");
                    break;
                default:
                    System.out.println("Invalid option..");

            }
            System.out.println("Do you want to continue? (Y/N)");
            scanner.nextLine();
            input = scanner.next();
        }while (input.equalsIgnoreCase("Y"));
        System.out.println("Thank you for using the application!");

        System.out.println("Main ended");
    }
}
