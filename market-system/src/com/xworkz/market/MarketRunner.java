package com.xworkz.market;
import com.xworkz.market.market.Market;
import com.xworkz.market.onlinemarket.OnlineMarket;
import com.xworkz.market.supermarket.SuperMarket;

public class MarketRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Market m1 = new SuperMarket();
        m1.marketInfo("Big Bazaar", "Bangalore", 50, "Super Market");

        SuperMarket s1 = new SuperMarket();
        s1.displaySuperMarketInfo("Reliance Fresh", "Mysore", 30);

        Market m2 = new OnlineMarket();
        m2.marketInfo("Amazon", "Online", 1000, "Online Market");

        OnlineMarket o1 = new OnlineMarket();
        o1.displayOnlineMarketInfo("Flipkart", "Online", 500);

        System.out.println("Main Ended");
    }
}