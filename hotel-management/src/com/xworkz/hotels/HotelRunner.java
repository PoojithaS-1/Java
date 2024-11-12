package com.xworkz.hotels;

import com.xworkz.hotels.radisson.Radisson;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Radisson radisson = new Radisson();
        radisson.getHotelDetails("Radisson", "Delhi", 4.5);
        System.out.println("Main ended");
    }
}
