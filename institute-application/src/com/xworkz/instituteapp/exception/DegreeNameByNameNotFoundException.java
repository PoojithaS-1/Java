package com.xworkz.instituteapp.exception;

public class DegreeNameByNameNotFoundException extends RuntimeException{
    public DegreeNameByNameNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
