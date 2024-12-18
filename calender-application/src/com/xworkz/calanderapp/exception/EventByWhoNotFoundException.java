package com.xworkz.calanderapp.exception;

public class EventByWhoNotFoundException extends RuntimeException{
    public EventByWhoNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
