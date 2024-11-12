package com.xworkz.hplaptop.laptop;

public class Laptop {
    public Laptop(){
        System.out.println("Laptop constructor is invoked");
    }
    public void getLaptopDetails(String name ,double price,String modelId, String processor, String ram){
        if (name != null ) {
            System.out.println("Name: " + name);
        }
        else {
            System.out.println(" Name cannot be null or empty.");
        }
        if (price > 0) {
            System.out.println("Price: " + price);
        }else {
            System.out.println("Invalid price: Price must be greater than zero.");

        }
    }

}
