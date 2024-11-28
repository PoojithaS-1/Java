package com.xworkz.realestateapp;

import com.xworkz.realestateapp.commercialspace.CommercialSpace;
import com.xworkz.realestateapp.fancystore.FancyStore;

public class CommercialRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        CommercialSpace fancyStore=new FancyStore();
        int ref1 =fancyStore.doBusiness();
        System.out.println(ref1);
    }
}
