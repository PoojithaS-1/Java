package com.xworkz.calanderapp.exception;

public class EventByStartDateNotFoundException extends RuntimeException{
    public EventByStartDateNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
