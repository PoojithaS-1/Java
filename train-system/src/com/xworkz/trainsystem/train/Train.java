package com.xworkz.trainsystem.train;

public class Train {
    private  int trainNUmber;
    private  String source;
    private  String destination;

    public int getTrainNUmber() {
        return trainNUmber;
    }

    public void setTrainNUmber(int trainNUmber) {
        this.trainNUmber = trainNUmber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Train() {
        System.out.println("Trains are the fastest means of transport on road");
    }

    public void transport(){
        System.out.println("invoked train class method");
        System.out.println("Travelling long distance, within or between the cities");
    }

    public  void getTrainInfo(){
        System.out.println("Train Info: ");
        System.out.println("Train number: "+getTrainNUmber());
        System.out.println("Source: "+getSource());
        System.out.println("Destination: "+getDestination());
    }
}
