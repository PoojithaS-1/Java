package com.xworkz.calanderapp.exception;

public class EventByDescriptionNotFoundException extends RuntimeException{
    public EventByDescriptionNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
