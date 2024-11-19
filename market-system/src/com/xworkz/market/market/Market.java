package com.xworkz.market.market;

public class Market {
    public Market() {
        System.out.println("Market constructor is invoked");
    }

    public void marketInfo(String name, String location, int shops, String type) {
        System.out.println("Market Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Shops: " + shops);
        System.out.println("Type: " + type);
    }
}

