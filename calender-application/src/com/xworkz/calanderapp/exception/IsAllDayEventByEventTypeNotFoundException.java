package com.xworkz.calanderapp.exception;

public class IsAllDayEventByEventTypeNotFoundException extends RuntimeException{
    public IsAllDayEventByEventTypeNotFoundException(String errorMsg){
        super(errorMsg);
    }
}
