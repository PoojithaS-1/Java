package com.xworkz.calanderapp.exception;

public class WhoByStartDateNotFoundException extends RuntimeException{
    public WhoByStartDateNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
