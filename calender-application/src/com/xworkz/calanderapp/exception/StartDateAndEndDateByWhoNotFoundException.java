package com.xworkz.calanderapp.exception;

public class StartDateAndEndDateByWhoNotFoundException extends RuntimeException{
    public StartDateAndEndDateByWhoNotFoundException(String msgError){
        super(msgError);
    }
}
