package com.xworkz.ironboxinfosystem;

import com.xworkz.ironboxinfosystem.ironboxdetails.IronBoxDetails;

public class IronBoxDetailsRunner {
    public static void main(String ironing[]){
        IronBoxDetails iron=new IronBoxDetails();
        iron.setType("Electric");
        String type=iron.getType();
        System.out.println("IronBox Type is: "+type);
        iron.setBrand("Philips");
        String brand=iron.getBrand();
        System.out.println("IronBox brand is: "+brand);
        iron.setModel("Philips GC1905");
        String model= iron.getModel();
        System.out.println("IronBox model is: "+model);
        iron.setPrice(1000.00);
        double price=iron.getPrice();
        System.out.println("The IronBox price is: "+price);
        iron.setSteamFunction(false);
        boolean isSteamFunction=iron.isSteamFunction();
        System.out.println("isSteamFunction: "+isSteamFunction);

    }
}
