package com.xworkz.calciapp.calculator;

import com.xworkz.calciapp.calculator.comparator.PowerSourceComparator;
import com.xworkz.calciapp.calculator.comparator.CalciScreenSizeComparator;
import com.xworkz.calciapp.calculator.comparator.CalciBrandComparator;
import com.xworkz.calciapp.calculator.comparator.CalculatorTypeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorRunner {
    public static void main(String[] args) {
        List<Calculator> list = new ArrayList<>();
        list.add(new Calculator("Casio", true, "Business", "Solar Powered", 7));
        list.add(new Calculator("Texas Instruments", false, "Scientific", "Battery Powered", 10));
        list.add(new Calculator("HP", true, "Graphing", "USB Rechargeable", 12));
        list.add(new Calculator("Canon", false, "Basic", "Solar Powered", 5));
        list.add(new Calculator("Sharp", true, "Engineering", "Battery Powered", 9));
        list.add(new Calculator("Toshiba", false, "Financial", "Solar Powered", 8));

        System.out.println("Comparable sorting for ScreenSize:");
        Collections.sort(list);
        for (Calculator calculator : list) {
            System.out.println(calculator);

        } System.out.println();
        System.out.println("Brandwise sorting:");
        Collections.sort(list,new CalciBrandComparator());
        for (Calculator calculator:list){
            System.out.println(calculator);
        }

        System.out.println();
        System.out.println("CalculatorType sorting:");
        Collections.sort(list,new CalculatorTypeComparator());
        for (Calculator calculator:list){
            System.out.println(calculator);
        }

        System.out.println();
        System.out.println("ScreenSize sorting:");
        Collections.sort(list,new CalciScreenSizeComparator());
        for (Calculator calculator:list){
            System.out.println(calculator);
        }

        System.out.println();
        System.out.println("PowerSource sorting:");
        Collections.sort(list,new PowerSourceComparator());
        for (Calculator calculator:list){
            System.out.println(calculator);
        }
    }
}