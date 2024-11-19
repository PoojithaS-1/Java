package com.xworkz.washingmachinesystem;

import com.xworkz.washingmachinesystem.washingmachine.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine wash=new WashingMachine();
        wash.setCapacity(7);
        int capacity=wash.getCapacity();
        System.out.println("WashingMachine capacity is: "+capacity+ " Kilograms");
        wash.setBrand("Whirlpool");
        String brand=wash.getBrand();
        System.out.println("WashingMachine brand is: "+brand);
        wash.setVoltage(230);
        int voltage=wash.getVoltage();
        System.out.println("WashingMachine voltage is: "+voltage+ " volts");
        wash.setMaximumRotationalSpeed(740);
        int maximumRotationalSpeed=wash.getMaximumRotationalSpeed();
        System.out.println("WashingMachine maximum Rotational Speed is: "+maximumRotationalSpeed+ " RPM");
        wash.setAccessLocation("Top Load");
        String accessLocation=wash.getAccessLocation();
        System.out.println("WashingMachine accessLocation is: "+accessLocation);
    }
}
