package com.xworkz.calanderapp.exception;

public class StartDateByWhoNotFoundException extends RuntimeException{
    public StartDateByWhoNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
