package com.xworkz.sports.sport;

public class Sport {
    public Sport() {
        System.out.println("Sport constructor is invoked");
    }
    public void getSportDetails(String name, int players) {
        System.out.println("Sport Name: " + name);
        System.out.println("Number of Players: " + players);
    }
}
