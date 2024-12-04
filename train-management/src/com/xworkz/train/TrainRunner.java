package com.xworkz.train;

import com.xworkz.train.metrotrain.MetroTrain;
import com.xworkz.train.suburbantrain.SubUrbanTrain;
import com.xworkz.train.train.Train;

import java.lang.annotation.Target;

public class TrainRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Train t1=new MetroTrain();
        t1.trainInfo(1,"Shimoga","Tarikere");
        MetroTrain m1=new MetroTrain();
        m1.trainInfo(2,"Sagara","Tumkur");
        Train t2=new SubUrbanTrain();
        t2.trainInfo(3,"Bombay","Hyderabad");
        SubUrbanTrain s1=new SubUrbanTrain();
        s1.trainInfo(4,"Bhadravathi","Bangalore");
        System.out.println("Main Ended");

    }
}
