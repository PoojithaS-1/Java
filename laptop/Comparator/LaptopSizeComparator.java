package com.xworkz.calciapp.laptop.Comparator;

import com.xworkz.calciapp.laptop.LaptopBag;

import java.util.Comparator;

public class LaptopSizeComparator implements Comparator<LaptopBag> {
    @Override
    public int compare(LaptopBag o1, LaptopBag o2) {
        return o1.getSize()-o2.getSize();
    }
}
