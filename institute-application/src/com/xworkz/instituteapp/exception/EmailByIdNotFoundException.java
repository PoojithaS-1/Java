package com.xworkz.instituteapp.exception;

public class EmailByIdNotFoundException extends RuntimeException{
    public EmailByIdNotFoundException(String msg){
        super(msg);
    }
}
