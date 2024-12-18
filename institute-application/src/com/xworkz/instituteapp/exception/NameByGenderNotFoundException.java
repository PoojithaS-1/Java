package com.xworkz.instituteapp.exception;

public class NameByGenderNotFoundException extends RuntimeException{
    public NameByGenderNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
