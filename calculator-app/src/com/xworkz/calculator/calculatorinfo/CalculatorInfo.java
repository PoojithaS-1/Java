package com.xworkz.calculator.calculatorinfo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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

        @Override
        public String toString(){
                return "CalculatorInfo-Brand= "+this.brand+","+
                        "IsSolarPower= "+this.isSolarPowered+","+
                        "calculatorType= "+this.calculatorType+","+
                        "PowerSource= "+this.powerSource+","+
                        "ScreenSize= "+this.screenSize;
        }

}


