package com.xworkz.railwayapp;

import com.xworkz.railwayapp.station.Station;
import com.xworkz.railwayapp.train.Train;

public class StationTrainRunner {
    public static void main(String[] args){
        Station station=new Station();
        Train train=new Train();
        train.setTrainNumber(12456);
        train.setTrainName("Chennai Express");
        train.setDepartureStation("Chennai Central (MAS)");
        train.setDestinationStation("Mumbai CST (CST)");
        train.setDepartureTime("20:45 (8:45 PM)");

        station.addTrain(train);
        station.getTrainInfo();
    }
}
