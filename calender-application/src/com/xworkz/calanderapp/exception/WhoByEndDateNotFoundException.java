package com.xworkz.calanderapp.exception;

public class WhoByEndDateNotFoundException extends RuntimeException{
    public WhoByEndDateNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
