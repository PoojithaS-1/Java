package com.xworkz.calculator.calculatorinfo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Setter
@Getter

public class CalculatorInfo {
        private int id;
        private String brand;
        private boolean isSolarPowered;
        private String calculatorType;
        private String powerSource;
        private int screenSize;

        public CalculatorInfo(){
            System.out.println("CalculatorDetails constructor is invoked");
        }


        @Override
        public int hashCode() {
                return this.id;
        }
        @Override
        public boolean equals(Object obj){
                CalculatorInfo calculator=(CalculatorInfo)obj;
                if (this.hashCode()==calculator.hashCode())
                        return true;
                return false;
        }

        //        @Override
//        public String toString(){
//                return "CalculatorInfo-" +
//                        "id= "+this.id+","+
//                        "Brand= "+this.brand+","+
//                        "IsSolarPower= "+this.isSolarPowered+","+
//                        "calculatorType= "+this.calculatorType+","+
//                        "PowerSource= "+this.powerSource+","+
//                        "ScreenSize= "+this.screenSize;
//        }

}


