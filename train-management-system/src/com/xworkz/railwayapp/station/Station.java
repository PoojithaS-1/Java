package com.xworkz.railwayapp.station;

import com.xworkz.railwayapp.train.Train;

public class Station {
    Train train;
    public boolean addTrain(Train train){
        boolean isTrainAdded=false;
        if (train != null){
            if(train.getTrainNumber()>0 && train.getTrainName()!=null){
                this.train=train;
                isTrainAdded=true;
            }else {
                System.out.println("Train details not added");
            }
        }
        return isTrainAdded;
    }
    public void getTrainInfo(){
        System.out.println("TrainNumber is: "+train.getTrainNumber());
        System.out.println("TrainName is: "+train.getTrainName());
        System.out.println("departureStation is: "+train.getDepartureStation());
        System.out.println("destinationStation is; "+train.getDestinationStation());
        System.out.println("departureTime is: "+train.getDepartureTime());
    }
}
