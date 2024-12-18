package com.xworkz.calanderapp.exception;

public class EventByTypeNotFoundException extends RuntimeException{
    public EventByTypeNotFoundException(String msg){
        super(msg);
    }
}
