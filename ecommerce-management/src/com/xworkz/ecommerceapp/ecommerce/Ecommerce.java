package com.xworkz.ecommerceapp.ecommerce;

import com.xworkz.ecommerceapp.product.Product;

public class Ecommerce {
    Product product;
    public boolean addProduct(Product product){
        boolean isProductAdded=false;
        if (product != null){
            if (product.getProductId()>0 && product.getProductName() !=null){
                this.product=product;
                isProductAdded=true;
            }else{
                System.out.println("Product is not added");
            }
        }
        return isProductAdded;
    }
    public void getProductDetails(){
        System.out.println("productId is: "+product.getProductId());
        System.out.println("ProductName is: "+product.getProductName());
        System.out.println("operatingSystem: "+product.getOperatingSystem());
        System.out.println("storage is: "+product.getStorage()+" GB");
        System.out.println("Price is: "+product.getPrice());
    }
}
