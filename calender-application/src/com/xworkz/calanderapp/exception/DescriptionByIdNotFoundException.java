package com.xworkz.calanderapp.exception;

public class DescriptionByIdNotFoundException extends RuntimeException{
    public DescriptionByIdNotFoundException(String eMsg){
        super(eMsg);
    }
}
