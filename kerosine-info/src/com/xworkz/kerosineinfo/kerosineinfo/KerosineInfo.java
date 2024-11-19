package com.xworkz.kerosineinfo.kerosineinfo;

public class KerosineInfo {
    double price;
    int quantity;
    boolean quality;
    public KerosineInfo(){
        this(90.00,500,true);
        System.out.println("no argument constructor is invoked");

    }
    public KerosineInfo(double price,int quantity, boolean quality){
        this(true);
        System.out.println("3 Argument constructor is invoked");
        this.price=price;
        this.quantity=quantity;
        this.quality=quality;
    }
    public KerosineInfo(boolean quality){
        this(95.00);
        System.out.println("1 Argument constructor is invoked");
        this.quality=quality;
    }
    public KerosineInfo(double price){
        System.out.println("1 Argument constructor is invoked");
        this.price=price;

    }
       public void getKerosineInfo(){
           System.out.println("Kerosine Info: ");
           System.out.println("Kerosine Price: "+price);
           System.out.println("Kerosine Quantity is: "+quantity);
           System.out.println("Is Kerosine Quality Good: "+quality);
       }
}
