package com.xworkz.instituteapp.exception;

public class GenderByNameNotFoundException extends RuntimeException{
    public GenderByNameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
