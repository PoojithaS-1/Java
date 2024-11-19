package com.xworkz.ironboxinfosystem.ironboxdetails;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IronBoxDetails {

        private String type;
        private String brand;
        private String model;
        private double price;
        private boolean isSteamFunction;

        public IronBoxDetails(){
            System.out.println("The IronBox constructor is invoked");
        }

}
