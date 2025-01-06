package com.xworkz.calciapp.calculator.comparator;

import com.xworkz.calciapp.calculator.Calculator;

import java.util.Comparator;

public class CalculatorTypeComparator implements Comparator<Calculator> {
    @Override
    public int compare(Calculator o1, Calculator o2) {
        return o1.getCalculatorType().compareTo(o2.getCalculatorType());
    }
}
