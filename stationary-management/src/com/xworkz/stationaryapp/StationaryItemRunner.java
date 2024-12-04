package com.xworkz.stationaryapp;

import com.xworkz.stationaryapp.item.Item;
import com.xworkz.stationaryapp.stationaryshop.Stationary;

public class StationaryItemRunner {
    public static void main(String[] args){
        Stationary stationary=new Stationary();
        Item item=new Item();
        System.out.println(item);
        item.setItemId(101);
        item.setItemName("Renolds");
        item.setMaterial("Plastic");
        item.setPrice(20.00);
        System.out.println(item);
        stationary.addItem(item);
        stationary.getItemDetails();

    }
}
