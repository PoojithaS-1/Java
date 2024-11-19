package com.xworkz.electrickettle.kettle;

import lombok.Getter;
import lombok.Setter;

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
}
