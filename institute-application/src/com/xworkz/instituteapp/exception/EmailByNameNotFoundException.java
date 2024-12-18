package com.xworkz.instituteapp.exception;

public class EmailByNameNotFoundException extends RuntimeException{
    public EmailByNameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
