package com.xworkz.trainsystem.suburbantrain;

import com.xworkz.trainsystem.train.Train;

public class SubUrbanTrain extends Train {
    public SubUrbanTrain() {
        System.out.println("Inter-city express");
    }
    @Override
    public void transport(){
        System.out.println("invoked sub urban class method");
        System.out.println("Travelling between the cities within 150 kms");
    }
}
