package com.xworkz.market.supermarket;

import com.xworkz.market.market.Market;

public class SuperMarket extends Market {
    public SuperMarket() {
        super();
        System.out.println("SuperMarket Constructor is invoked");
    }

    public void displaySuperMarketInfo(String name, String location, int shops) {
        System.out.println("Super Market Details:");
        marketInfo(name, location, shops, "Super Market");
    }
}