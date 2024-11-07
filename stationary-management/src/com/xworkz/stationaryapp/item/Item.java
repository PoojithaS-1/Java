package com.xworkz.stationaryapp.item;

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
}
