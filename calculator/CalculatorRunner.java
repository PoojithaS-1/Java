package com.xworkz.calciapp.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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
        list.add(new Calculator("Panasonic", true, "Printing", "USB Rechargeable", 11));
        list.add(new Calculator("Olympus", false, "Scientific", "Battery Powered", 10));
        list.add(new Calculator("Sanyo", true, "Basic", "Solar Powered", 6));
        list.add(new Calculator("Datexx", false, "Graphing", "USB Rechargeable", 13));
        Collections.sort(list);
        for (Calculator calculator : list) {
            System.out.println(calculator);
        }
    }
}