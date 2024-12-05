package com.xworkz.ecommerceapp;

import com.xworkz.ecommerceapp.ecommerce.Ecommerce;
import com.xworkz.ecommerceapp.product.Product;

public class EcomProductRunner {
    public static void main(String[] args) {
        Ecommerce ecommerce = new Ecommerce();
        Product product = new Product();
        System.out.println(product.toString());
        product.setProductId(123);
        product.setProductName("Camera");
        product.setOperatingSystem("iOS 16");
        product.setStorage(128);
        product.setPrice(12500.00);
        System.out.println(product.hashCode());

        Product product1 = new Product();
        System.out.println(product1.toString());
        product1.setProductId(13);
        product1.setProductName("Camera");
        product1.setOperatingSystem("iOS 16");
        product1.setStorage(128);
        product1.setPrice(12500.00);
        System.out.println(product1.hashCode());

        boolean areSame=product.equals(product1);
        System.out.println(areSame);
//        System.out.println(product);
//        ecommerce.addProduct(product);
//        ecommerce.getProductDetails();



    }
}
