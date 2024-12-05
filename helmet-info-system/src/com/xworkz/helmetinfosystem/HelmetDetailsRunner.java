package com.xworkz.helmetinfosystem;

import com.xworkz.helmetinfosystem.helmetdetails.HelmetDetails;

public class HelmetDetailsRunner {
    public static void main(String safety[]){
        HelmetDetails helmet=new HelmetDetails();
        helmet.setColor("Glossy Black");
        String color=helmet.getColor();
        System.out.println("Helmet color is: "+color);
        helmet.setBrand("Axor");
        String brand=helmet.getBrand();
        System.out.println("Helmet Brand is: "+brand);
        helmet.setVehicleServiceType("Motorcycle");
        String vehicleServiceType=helmet.getVehicleServiceType();
        System.out.println("Helmet type is: "+vehicleServiceType);
        helmet.setItemWeight(1600);
        int itemWeight=helmet.getItemWeight();
        System.out.println("Helmet weight is: "+itemWeight+ " Grams");
        helmet.setMaterial("Acrylonitrile Butadiene Styrene (ABS)");
        String material=helmet.getMaterial();
        System.out.println("Helmet material is: "+material);
    }
}
