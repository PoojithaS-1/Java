package com.xworkz.market.onlinemarket;
import com.xworkz.market.market.Market;

public class OnlineMarket extends Market {
    public OnlineMarket() {
        super();
        System.out.println("OnlineMarket Constructor is invoked");
    }

    public void displayOnlineMarketInfo(String name, String location, int shops) {
        System.out.println("Online Market Details:");
        marketInfo(name, location, shops, "Online Market");
    }
}
