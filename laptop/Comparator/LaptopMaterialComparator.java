package com.xworkz.calciapp.laptop.Comparator;

import com.xworkz.calciapp.laptop.LaptopBag;

import java.util.Comparator;

public class LaptopMaterialComparator implements Comparator<LaptopBag> {
    @Override
    public int compare(LaptopBag o1, LaptopBag o2) {
        return o1.getMaterial().compareTo(o2.getMaterial());
    }
}
