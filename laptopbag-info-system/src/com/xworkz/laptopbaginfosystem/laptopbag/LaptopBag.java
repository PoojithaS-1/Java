package com.xworkz.laptopbaginfosystem.laptopbag;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LaptopBag {

        private int size;
        private String color;
        private String material;
        private boolean isWaterproof;
        private int numberOfCompartments;

        public LaptopBag(){
            System.out.println("LaptopBag constructor is invoked");
        }
}
