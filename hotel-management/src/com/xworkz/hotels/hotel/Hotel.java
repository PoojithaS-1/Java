package com.xworkz.hotels.hotel;

public class Hotel {
    public Hotel() {
        System.out.println("Hotel constructor is invoked");
    }

    public void getHotelDetails(String name, String location, double rating) {
        if (name != null) {
            System.out.println("Hotel Name: " + name);
        } else {
            System.out.println("Hotel name cannot be null or empty.");
        }
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating);
    }
}
