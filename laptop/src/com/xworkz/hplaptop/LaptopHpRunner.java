package com.xworkz.hplaptop;

import com.xworkz.hplaptop.hp.Hp;
import com.xworkz.hplaptop.laptop.Laptop;

public class LaptopHpRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Hp hp=new Hp();
        hp.getLaptopDetails("HP",45000.00,"20W0S0T200","Intel Core i5-1135G7","8GB DDR4");
        System.out.println("Main Ended");
    }
}
