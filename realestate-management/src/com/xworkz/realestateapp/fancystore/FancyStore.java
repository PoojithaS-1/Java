package com.xworkz.realestateapp.fancystore;

import com.xworkz.realestateapp.commercialspace.CommercialSpace;

public class FancyStore implements CommercialSpace {

    @Override
    public int doBusiness() {
        System.out.println("Fancy Store sells fancy things");
        return 345;
    }
}
