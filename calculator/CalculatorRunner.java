package com.xworkz.calciapp.customtype.calculator;

import java.util.LinkedList;

public class CalculatorRunner {
    public static void main(String[] args) {
        LinkedList<Calculator> linkedList = new LinkedList<>();
        linkedList.add(new Calculator("Casio", true, "Business", "Solar Powered", 7));
        linkedList.add(new Calculator("Texas Instruments", false, "Scientific", "Battery Powered", 10));
        linkedList.add(new Calculator("HP", true, "Graphing", "USB Rechargeable", 12));
        linkedList.add(new Calculator("Canon", false, "Basic", "Solar Powered", 5));
        linkedList.add(new Calculator("Sharp", true, "Engineering", "Battery Powered", 9));

        for (Calculator calculator : linkedList) {
            System.out.println(calculator);
        }
    }
}