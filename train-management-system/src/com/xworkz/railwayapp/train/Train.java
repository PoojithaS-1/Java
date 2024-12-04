package com.xworkz.railwayapp.train;

public class Train {
    private int trainNumber;
    private String trainName;
    private String departureStation;
    private String destinationStation;
    private String departureTime;

    public Train(){
        System.out.println("Train  constructor invoked");
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Train-trainNumber= " + this.trainNumber +","+
                "trainName= " + this.trainName +","+
                "departureStation= " + this.departureStation +","+
                "destinationStation= " +this.destinationStation +","+
                "departureTime= " + this.departureTime ;
    }
}
