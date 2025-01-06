package com.xworkz.calciapp.helmet.comparator;

import com.xworkz.calciapp.helmet.Helmet;

import java.util.Comparator;

public class HelmateBrandComparator implements Comparator<Helmet> {
    @Override
    public int compare(Helmet o1, Helmet o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
