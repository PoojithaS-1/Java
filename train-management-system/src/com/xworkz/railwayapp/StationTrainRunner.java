package com.xworkz.railwayapp;

import com.xworkz.railwayapp.station.Station;
import com.xworkz.railwayapp.train.Train;

public class StationTrainRunner {
    public static void main(String[] args){
        Station station=new Station();
        Train train=new Train();
        System.out.println(train.toString());
        train.setTrainNumber(12456);
        train.setTrainName("Chennai Express");
        train.setDepartureStation("Chennai Central (MAS)");
        train.setDestinationStation("Mumbai CST (CST)");
        train.setDepartureTime("20:45 (8:45 PM)");
//        System.out.println(train);
        System.out.println(train.hashCode());

        Train train1 =new Train();
        System.out.println(train1.toString());
        train1.setTrainNumber(12456);
        train1.setTrainName("Chennai Express");
        train1.setDepartureStation("Chennai Central (MAS)");
        train1.setDestinationStation("Mumbai CST (CST)");
        train1.setDepartureTime("20:45 (8:45 PM)");
        System.out.println(train1.hashCode());


        boolean same=train.equals(train1);
        System.out.println(same);
//        station.addTrain(train1);
//        station.getTrainInfo();
    }
}
