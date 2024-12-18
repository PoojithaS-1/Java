package com.xworkz.libbookapp.exception;

public class BookByPriceNotFoundException extends Exception{
    public BookByPriceNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
