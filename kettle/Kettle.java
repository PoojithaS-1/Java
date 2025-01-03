package com.xworkz.calciapp.customtype.kettle;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter


public class Kettle {
    private String brand;
    private String color;
    private float capacity;
    private String material;
    private int voltage;
    public Kettle(){
        System.out.println("ElectricKettle constructor is invoked");
    }
    public Kettle(String brand, String color, float capacity, String material, int voltage) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.material = material;
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", material='" + material + '\'' +
                ", voltage=" + voltage +
                '}';
    }
}