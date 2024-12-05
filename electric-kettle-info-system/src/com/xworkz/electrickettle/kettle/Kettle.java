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
//
        @Override
        public int hashCode(){
                return voltage;
        }

        @Override
        public boolean equals(Object obj){
                Kettle kettle=(Kettle) obj;
                if (this.hashCode()==kettle.hashCode())
                        return true;
                return false;
        }
}
