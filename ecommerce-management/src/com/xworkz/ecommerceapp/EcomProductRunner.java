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
        System.out.println(product);
        ecommerce.addProduct(product);
        ecommerce.getProductDetails();

    }
}
