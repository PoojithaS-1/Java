package com.xworkz.theatre.theatre;

public class Theatre {
    public Theatre() {
        System.out.println("Theatre constructor is invoked");
    }

    public void getTheatreDetails(String name, String location) {
        if (name != null) {
            System.out.println("Theatre Name: " + name);
        } else {
            System.out.println("Theatre name cannot be null or empty.");
        }
        if (location != null ) {
            System.out.println("Location: " + location);
        } else {
            System.out.println("Location cannot be null or empty.");
        }
    }
}
