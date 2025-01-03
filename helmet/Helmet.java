package com.xworkz.calciapp.customtype.helmet;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Helmet {
    private String color;
    private String brand;
    private String vehicleServiceType;
    private int itemWeight;
    private String material;


    public Helmet(String color, String brand, String vehicleServiceType, int itemWeight, String material) {
        this.color = color;
        this.brand = brand;
        this.vehicleServiceType = vehicleServiceType;
        this.itemWeight = itemWeight;
        this.material = material;
    }
    @Override
    public String toString() {
        return "Helmet{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", vehicleServiceType='" + vehicleServiceType + '\'' +
                ", itemWeight=" + itemWeight +
                ", material='" + material + '\'' +
                '}';
    }
}
