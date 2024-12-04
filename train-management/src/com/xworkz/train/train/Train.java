package com.xworkz.train.train;

public class Train {

    public Train(){
        System.out.println("Train constructor is invoked");
    }
    public void trainInfo( int no,String source,String destination){
        System.out.println("Train number: "+no);
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
    }

}
