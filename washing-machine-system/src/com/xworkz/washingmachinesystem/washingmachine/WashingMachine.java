package com.xworkz.washingmachinesystem.washingmachine;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WashingMachine {
    private int capacity;
    private String brand;
    private int voltage;
    private int maximumRotationalSpeed;
    private String accessLocation;

    public WashingMachine(){
        System.out.println("WashingMachine constructor is invoked");
    }
}
