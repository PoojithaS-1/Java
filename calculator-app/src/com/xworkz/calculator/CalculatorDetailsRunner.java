package com.xworkz.calculator;


import com.xworkz.calculator.calculatorinfo.CalculatorInfo;

public class CalculatorDetailsRunner extends Object {
    public static void main(String[] maths) {
        CalculatorInfo calculator = new CalculatorInfo();
        System.out.println(calculator.toString());

        calculator.setId(1);

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
        System.out.println(calculator.hashCode());
//        System.out.println(calculator.toString());
        CalculatorInfo calculator1 = new CalculatorInfo();
        System.out.println(calculator1.toString());

        calculator1.setId(2);

        calculator1.setBrand("Casio");
//        String brand = calculator.getBrand();
//        System.out.println("Calculator brand is: " + brand);
//
        calculator1.setSolarPowered(true);
//        boolean isSolarPowered = calculator.isSolarPowered();
//        System.out.println("Is calculator solar-powered? " + isSolarPowered);
//
        calculator1.setCalculatorType("Business");
//        String calculatorType = calculator.getCalculatorType();
//        System.out.println("Calculator type is: " + calculatorType);
//
        calculator1.setPowerSource("Solar Powered");
//        String powerSource = calculator.getPowerSource();
//        System.out.println("Calculator power source: " + powerSource);
//
        calculator1.setScreenSize(7);

        System.out.println(calculator1.hashCode());

        boolean similar=calculator.equals(calculator1);
        System.out.println(similar);
    }
}
