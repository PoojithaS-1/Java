package com.xworkz.toasterinfosystem.toaster;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Toaster {
    private String brand;
    private double price;
    private String material;
    private String productDimensions;
    private String specificUseOfProduct;

    public Toaster(){
        System.out.println("Toaster constructor is invoked");
    }
}
