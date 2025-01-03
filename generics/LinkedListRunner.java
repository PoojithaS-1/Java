package com.xworkz.calciapp.customtype.generics;

import java.util.LinkedList;

public class LinkedListRunner {
    public static void main(String[] args) {

        LinkedList<Integer> list1=new LinkedList<>();
        System.out.println("Using Interger:");
        list1.add(2);
        list1.add(4400);
        list1.add(555);
        list1.add(1);
        list1.add(20);
        for (Object obj:list1){
            System.out.println(obj);
        }
        System.out.println();
        LinkedList<String> list2 =new LinkedList<>();
        System.out.println("Using String:");
        list2.add("Happy");
        list2.add("New");
        list2.add("Year");
        list2.add("2025");
        for (Object obj: list2){
            System.out.println(obj);
        }
        System.out.println();
        LinkedList<Character> list3 =new LinkedList<>();
        System.out.println("Using Character:");
        list3.add('H');
        list3.add('E');
        list3.add('L');
        list3.add('L');
        list3.add('O');
        for (Object obj: list3){
            System.out.println(obj);
        }
        System.out.println();

        LinkedList<Long> list4 = new LinkedList<>();
        System.out.println("Using Long:");
        list4.add(10000L);
        list4.add(20000L);
        list4.add(30000L);
        list4.add(40000L);
        list4.add(50000L);
        for (Object obj : list4) {
            System.out.println(obj);
        }
        System.out.println();

        LinkedList<Float> list5 = new LinkedList<>();
            System.out.println("Using Float:");
        list5.add(10.5f);
        list5.add(20.5f);
        list5.add(30.5f);
        list5.add(40.5f);
        list5.add(50.5f);
        for (Object obj : list5) {
            System.out.println(obj);
        }
        System.out.println();
        LinkedList<Double> list6 = new LinkedList<>();
        System.out.println("Using Double:");
        list6.add(100.5);
        list6.add(120.5);
        list6.add(310.5);
        list6.add(470.5);
        list6.add(580.5);
        for (Object obj : list6) {
            System.out.println(obj);
        }
    }
}

