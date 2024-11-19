package com.xworkz.raincoatinfosystem.raincoats;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RainCoats {
    private String closure;
    private String fabric;
    private String color;
    private int netQuantity;
    private double price;

    public RainCoats(){
        System.out.println("RainCoats constructor is invoked");
    }
}
