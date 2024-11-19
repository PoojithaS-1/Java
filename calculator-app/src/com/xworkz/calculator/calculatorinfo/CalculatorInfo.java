package com.xworkz.calculator.calculatorinfo;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter

public class CalculatorInfo {
        private String brand;
        private boolean isSolarPowered;
        private String calculatorType;
        private String powerSource;
        private int screenSize;

        public CalculatorInfo(){
            System.out.println("CalculatorDetails constructor is invoked");
        }
}


