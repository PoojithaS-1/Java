package com.xworkz.aeroplaneinfo.aeroplane;

public class Aeroplane {
    String company;
    int noOfSeats;
    double ticketPrice;
    String source;
    String destination;

    public Aeroplane() {
        this("Boeing", 200, 5000.0, "Bangalore", "Delhi");
        System.out.println("No argument constructor is invoked");
    }


    public Aeroplane(String company, int noOfSeats, double ticketPrice, String source, String destination) {
        this.company = company;
        this.noOfSeats = noOfSeats;
        this.ticketPrice = ticketPrice;
        this.source = source;
        this.destination = destination;
        System.out.println("5 Argument constructor is invoked");
    }


    public Aeroplane(String company, String source, String destination) {
        this(company, 200, 5000.0, source, destination);
        System.out.println("3 Argument constructor is invoked");
    }


    public Aeroplane(String company, double ticketPrice, String source, String destination) {
        this(company, 200, ticketPrice, source, destination);
        System.out.println("4 Argument constructor is invoked");
    }


    public void getAeroplaneInfo() {
        System.out.println("Aeroplane Info: ");
        System.out.println("Company: " + company);
        System.out.println("No of Seats: " + noOfSeats);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
    }
}

