package com.xworkz.libbookapp.exception;

public class DeleteBookByIdNotFoundException extends Exception{
    public DeleteBookByIdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
