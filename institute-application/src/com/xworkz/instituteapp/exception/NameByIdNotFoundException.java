package com.xworkz.instituteapp.exception;

public class NameByIdNotFoundException extends RuntimeException{
    public NameByIdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
