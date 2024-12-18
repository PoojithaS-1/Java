package com.xworkz.libbookapp.exception;

public class BookNameByidNotFoundException extends Exception{
    public BookNameByidNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
