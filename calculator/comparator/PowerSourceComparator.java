package com.xworkz.calciapp.calculator.comparator;

import com.xworkz.calciapp.calculator.Calculator;

import java.util.Comparator;

public class PowerSourceComparator implements Comparator<Calculator> {
    @Override
    public int compare(Calculator o1, Calculator o2) {
        return o1.getPowerSource().compareTo(o2.getPowerSource());
    }
}
