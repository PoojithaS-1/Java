package com.xworkz.calanderapp.exception;

public class EventByEndDateNotFoundException extends RuntimeException{
    public EventByEndDateNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
