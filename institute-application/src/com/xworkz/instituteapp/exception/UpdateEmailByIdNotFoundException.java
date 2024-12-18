package com.xworkz.instituteapp.exception;

public class UpdateEmailByIdNotFoundException extends RuntimeException{
    public UpdateEmailByIdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
