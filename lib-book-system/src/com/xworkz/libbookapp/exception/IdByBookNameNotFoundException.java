package com.xworkz.libbookapp.exception;

public class IdByBookNameNotFoundException extends Exception{
    public IdByBookNameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
