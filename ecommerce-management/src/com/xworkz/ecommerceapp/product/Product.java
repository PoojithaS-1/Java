package com.xworkz.ecommerceapp.product;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private String operatingSystem;
    private int storage;
    private double price;

    public Product() {
        System.out.println("Product constructtor invoked");
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

//    @Override
//    public String toString() {
//        return "Product-productId= "+this.productId+","+
//                "productName= "+this.productName+","+
//                "operatingSystem= "+this.operatingSystem+","+
//                "Storage= "+this.storage+","+
//                "Price= "+this.price;
//    }

    @Override
    public boolean equals(Object obj) {
        Product product=(Product) obj;
        if (this.hashCode()==product.productId)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return this.productId;
    }
}
