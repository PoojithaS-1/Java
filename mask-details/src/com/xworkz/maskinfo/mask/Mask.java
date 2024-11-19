package com.xworkz.maskinfo.mask;

public class Mask {
    double cost;
    char size;
    String material;
    public Mask()
    {
        this(20.00);
        System.out.println("No arguements constructor is invoked");
    }
    public Mask(double cost){
        this('M');
        System.out.println("Constructor with cost as argument is invoked");
        this.cost=cost;
    }
    public Mask(char size){
        this("Cotton");
        System.out.println("Constructor with size as argument is invoked");
        this.size=size;
    }
    public Mask(String material){
        this(20.00,'M',"Cotton");
        System.out.println("Constructor with material as argument is invoked");
        this.material=material;
    }
    public Mask(double cost, char size, String material){
        this(25.00,'M');
        System.out.println("Constructor with cost, size, material as argument is invoked");
        this.cost=cost;
        this.size=size;
        this.material=material;
    }
    public Mask(double cost, char size){
        System.out.println("Constructor with cost and size as argument is invoked");
        this.cost=cost;
        this.size=size;
    }
    public void getMaskInfo(){
        System.out.println("Mask Info:");
        System.out.println("Cost of Mask is: "+cost);
        System.out.println("Size of Mask is: "+size);
        System.out.println("Material of Mask is: "+material);

    }

}
