package com.xworkz.marketmanagement.supermarket;

import com.xworkz.marketmanagement.market.Market;

public class SuperMarket extends Market {
    @Override
    public void exchange(){
        System.out.println("invoked super market class method");
        System.out.println("Exchange takes place in the shop/building and all the items are available in one place");
    }
}
