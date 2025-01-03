package com.xworkz.calciapp.customtype.calculator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Calculator {
    private String brand;
    private boolean isSolarPowered;
    private String calculatorType;
    private String powerSource;
    private int screenSize;

    public Calculator(String brand, boolean isSolarPowered, String calculatorType, String powerSource, int screenSize) {
        this.brand = brand;
        this.isSolarPowered = isSolarPowered;
        this.calculatorType = calculatorType;
        this.powerSource = powerSource;
        this.screenSize = screenSize;
    }

}