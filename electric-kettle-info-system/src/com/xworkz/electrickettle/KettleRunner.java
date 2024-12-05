package com.xworkz.electrickettle;

import com.xworkz.electrickettle.kettle.Kettle;

public class KettleRunner {
    public static void main(String k[]){
        Kettle kettle=new Kettle();
        System.out.println(kettle);
        kettle.setBrand("Pigeon");
//        String brand=kettle.getBrand();
//        System.out.println("Kettle brand is: "+brand);
        kettle.setColor("Black & Silver");
//        String color=kettle.getColor();
//        System.out.println("Kettle color is: "+color);
        kettle.setCapacity(1.5f);
//        float capacity=kettle.getCapacity();
//        System.out.println("Kettle capacity is: "+capacity+ " Litres");
        kettle.setMaterial("Stainless Steel,Plastic");
//        String material=kettle.getMaterial();
//        System.out.println("Kettle material is: "+material);
        kettle.setVoltage(240);
//        int voltage=kettle.getVoltage();
//        System.out.println("voltage of Kettle is: "+voltage);
        System.out.println(kettle.hashCode());


        Kettle kettle1 =new Kettle();
        System.out.println(kettle1);
        kettle1.setBrand("Pigeon");
//        String brand=kettle.getBrand();
//        System.out.println("Kettle brand is: "+brand);
        kettle1.setColor("Black & Silver");
//        String color=kettle.getColor();
//        System.out.println("Kettle color is: "+color);
        kettle1.setCapacity(1.5f);
//        float capacity=kettle.getCapacity();
//        System.out.println("Kettle capacity is: "+capacity+ " Litres");
        kettle1.setMaterial("Stainless Steel,Plastic");
//        String material=kettle.getMaterial();
//        System.out.println("Kettle material is: "+material);
        kettle1.setVoltage(249);

        System.out.println(kettle1.hashCode());

        boolean similar=kettle.equals(kettle1);
        System.out.println(similar);
    }
}
