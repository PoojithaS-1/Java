package com.xworkz.trainsystem.metrotrain;

import com.xworkz.trainsystem.train.Train;

public class MetroTrain extends Train {
    public MetroTrain() {
        System.out.println("Namma Metro");
    }

    @Override
    public  void transport(){
        System.out.println("invoked metro class method");
        System.out.println("Travelling within the city");
    }

}
