package com.xworkz.calciapp.customtype.ironbox;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IronBox {
    private String type;
    private String brand;
    private String model;
    private double price;
    private boolean isSteamFunction;


    public IronBox(String type, String brand, String model, double price, boolean isSteamFunction) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isSteamFunction = isSteamFunction;
    }
    @Override
    public String
    toString() {
        return "IronBox{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isSteamFunction=" + isSteamFunction +
                '}';
    }
}
