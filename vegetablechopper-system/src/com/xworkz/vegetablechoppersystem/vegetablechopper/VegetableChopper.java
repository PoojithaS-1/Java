package com.xworkz.vegetablechoppersystem.vegetablechopper;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class VegetableChopper {
    private int size;
    private String brand;
    private String productDimensions;
    private String color;
    private float bowlCapacity;

    public VegetableChopper(){
        System.out.println("VegetableChopper constructor invoked");
    }
}
