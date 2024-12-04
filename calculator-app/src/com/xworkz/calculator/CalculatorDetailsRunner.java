package com.xworkz.calculator;


import com.xworkz.calculator.calculatorinfo.CalculatorInfo;

public class CalculatorDetailsRunner extends Object {
    public static void main(String[] maths) {
        CalculatorInfo calculator = new CalculatorInfo();
        System.out.println(calculator.toString());

        calculator.setBrand("Casio");
//        String brand = calculator.getBrand();
//        System.out.println("Calculator brand is: " + brand);
//
        calculator.setSolarPowered(true);
//        boolean isSolarPowered = calculator.isSolarPowered();
//        System.out.println("Is calculator solar-powered? " + isSolarPowered);
//
        calculator.setCalculatorType("Business");
//        String calculatorType = calculator.getCalculatorType();
//        System.out.println("Calculator type is: " + calculatorType);
//
        calculator.setPowerSource("Solar Powered");
//        String powerSource = calculator.getPowerSource();
//        System.out.println("Calculator power source: " + powerSource);
//
        calculator.setScreenSize(7);
//        int screenSize = calculator.getScreenSize();
//        System.out.println("Screen size of calculator is: " + screenSize + " inches");

        System.out.println(calculator.toString());
    }
}
