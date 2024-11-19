package com.xworkz.toasterinfosystem;

import com.xworkz.toasterinfosystem.toaster.Toaster;

public class ToasterRunner {
    public static void main(String[] args) {
        Toaster toast=new Toaster();
        toast.setBrand("Bajaj");
        String brand=toast.getBrand();
        System.out.println("Toaster brand is: "+brand);
        toast.setPrice(1760.00);
        double price=toast.getPrice();
        System.out.println("Toaster price is: "+price+" Rs");
        toast.setMaterial("Stainless Steel");
        String material=toast.getMaterial();
        System.out.println("Toaster material is: "+material);
        toast.setProductDimensions("29D x 18.5W x 16.5H Centimeters");
        String productDimensions=toast.getProductDimensions();
        System.out.println("Toaster dimension is: "+productDimensions);
        toast.setSpecificUseOfProduct("Bread");
        String specificUseOfProduct=toast.getSpecificUseOfProduct();
        System.out.println("specific Use Of Toaster: "+specificUseOfProduct);
    }

}
