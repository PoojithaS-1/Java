package com.xworkz.marketmanagement.market;

public class Market {
    private String name;
    private String location;
    private String shop;
    private String type;

    public Market() {
        System.out.println("Market is any place or venue where buyers and sellers can exchange goods and services.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void exchange(){
        System.out.println("invoked market class method");
        System.out.println("Exchange takes place in the location allocated by the municipality");
    }

    public void getMarketInfo(){
        System.out.println("Market Info: ");
        System.out.println("Name: "+getName());
        System.out.println("Location: "+getLocation());
        System.out.println("Shop: "+getShop());
        System.out.println("Type: "+getType());
    }
}
