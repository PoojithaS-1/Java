package com.xworkz.calciapp.customtype.helmet;

import java.util.LinkedList;

public class HelmetRunner {
    public static void main(String[] args) {
        LinkedList<Helmet> linkedList=new LinkedList<>();
        linkedList.add(new Helmet("Black","Axor","MotorCycle",1600,"Acrylonitrile Butadiene Styrene (ABS)"));
        linkedList.add(new Helmet("White","Studds","Scooter",1200,"Acrylonitrile Butadiene Styrene (ABS)"));
        linkedList.add(new Helmet("Red","Vega","MotorCycle",2000,"Fiberglass"));
        linkedList.add(new Helmet("Blue","LS2","Off-Road",1800,"Polycarbonate"));
        linkedList.add(new Helmet("Grey","HJC","Street",1500,"Acrylonitrile Butadiene Styrene (ABS)"));
        for (Helmet helmet:linkedList){
            System.out.println(helmet);
        }
    }
}
