package com.xworkz.microovensystem.microwaveoven;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MicroWaveOven {
    private int size;
    private String brand;
    private String color;
    private String heatingMethod;
    private String fuelType;

    public MicroWaveOven(){
        System.out.println("MicroWaveOven constructor is invoked" );
    }
}
