package com.xworkz.raincoatinfosystem;

import com.xworkz.raincoatinfosystem.raincoats.RainCoats;

public class RaincoatRunner {
    public static void main(String rain[]){
        RainCoats coat=new RainCoats();
        coat.setClosure("Zipper");
        String closure=coat.getClosure();
        System.out.println("RainCoat's closure type is: "+closure);
        coat.setFabric("Polyester");
        String fabric=coat.getFabric();
        System.out.println("RainCoat's fabric is: "+fabric);
        coat.setColor("Brown");
        String color=coat.getColor();
        System.out.println("RainCoat's color is: "+color);
        coat.setNetQuantity(1);
        int netQuantity=coat.getNetQuantity();
        System.out.println("RainCoat's netQuantity is: "+netQuantity);
        coat.setPrice(499);
        double price=coat.getPrice();
        System.out.println("RainCoat's price is: "+price);
    }
}
