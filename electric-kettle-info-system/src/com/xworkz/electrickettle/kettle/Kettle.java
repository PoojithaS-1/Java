package com.xworkz.electrickettle.kettle;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

public class Kettle {

        private String brand;
        private String color;
        private float capacity;
        private String material;
        private int voltage;

        public Kettle(){
            System.out.println("ElectricKettle constructor is invoked");
        }
        @Override
        public String toString(){
                return "Kettle-Brand= "+this.brand+","+
                        "Color= "+this.color+","+
                        "Capacity= "+this.capacity+","+
                        "Material= "+this.material+","+
                        "Voltage= "+this.voltage;
        }
}
