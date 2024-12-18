package com.xworkz.calanderapp.exception;

public class EventIdNotFoundException extends RuntimeException{
    public EventIdNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
