package com.xworkz.stationaryapp.stationaryshop;

import com.xworkz.stationaryapp.item.Item;

public class Stationary {
    Item item;
    public boolean addItem(Item item){
        boolean isItemAdded=false;
        if(item != null){
            if(item.getItemId()>0 && item.getItemName()!=null){
                this.item=item;
                isItemAdded=true;
            }else {
                System.out.println("Item List is null");
            }
        }
        return isItemAdded;
    }
    public void getItemDetails(){
        System.out.println("itemId is: "+item.getItemId());
        System.out.println("itemName is: "+item.getItemName());
        System.out.println("Material is: "+item.getMaterial());
        System.out.println("Price is: "+item.getPrice());
    }

}
