package com.xworkz.stationaryapp.item;

import java.util.Objects;

public class Item {
    private int ItemId;
    private  String itemName;
    private String material;
    private double price;

    public Item(){
        System.out.println("Item constructor is invoked");
    }

    public void setItemId(int itemId) {
        this.ItemId = itemId;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

//    @Override
//    public String toString() {
//        return "Item-ItemId= "+this.ItemId+","+
//                "ItemName= "+this.itemName+","+
//                "material= "+this.material+","+
//                "price= "+this.price;
//    }


    @Override
    public boolean equals(Object obj) {
        Item item=(Item) obj;
        if (this.ItemId==item.ItemId)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return this.ItemId;
    }
}
