package com.xworkz.instituteapp.exception;

public class DobByIdNotFoundException extends RuntimeException{
    public DobByIdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
