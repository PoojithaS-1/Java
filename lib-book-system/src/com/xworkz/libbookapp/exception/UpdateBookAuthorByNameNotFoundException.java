package com.xworkz.libbookapp.exception;

public class UpdateBookAuthorByNameNotFoundException extends Exception {
    public UpdateBookAuthorByNameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
