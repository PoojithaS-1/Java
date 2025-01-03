package com.xworkz.calciapp.customtype.kettle;

import java.util.LinkedList;


public class KettleRunner {
    public static void main(String[] args) {
        LinkedList<Kettle> linkedList = new LinkedList<>();
        linkedList.add(new Kettle("Pigeon", "black", 1.5f, "Stainless Steel and Plastic", 240));
        linkedList.add(new Kettle("Philips", "white", 1.2f, "Plastic and Metal", 200));
        linkedList.add(new Kettle("Prestige", "silver", 1.8f, "Stainless Steel", 300));
        linkedList.add(new Kettle("Bajaj", "black", 1.0f, "Plastic and Metal", 180));
        linkedList.add(new Kettle("Havells", "white", 1.6f, "Stainless Steel and Plastic", 280));

        for (Kettle kettle:linkedList){
            System.out.println(kettle);
        }
    }
}