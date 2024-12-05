package com.xworkz.helmetinfosystem.helmetdetails;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HelmetDetails {

        private String color;
        private String brand;
        private String vehicleServiceType;
        private int itemWeight;
        private String material;

        public HelmetDetails(){
            System.out.println("HelmetDetails constructor is invoked");
        }

}
