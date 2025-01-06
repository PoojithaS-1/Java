package com.xworkz.calciapp.kettle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class KettleRunner {
    public static void main(String[] args) {
        List<Kettle> list = new ArrayList<>();
        list.add(new Kettle(3,"Pigeon", "black", 1.5f, "Stainless Steel and Plastic", 240));
        list.add(new Kettle(2,"Philips", "white", 1.2f, "Plastic and Metal", 200));
        list.add(new Kettle(1,"Prestige", "silver", 1.8f, "Stainless Steel", 300));
        list.add(new Kettle(5,"Bajaj", "black", 1.0f, "Plastic and Metal", 180));
        list.add(new Kettle(4,"Havells", "white", 1.6f, "Stainless Steel and Plastic", 280));
        list.add(new Kettle(6,"Morphy Richards", "silver", 1.7f, "Stainless Steel and Plastic", 260));
        list.add(new Kettle(7,"Inalsa", "black", 1.4f, "Plastic and Metal", 220));
        list.add(new Kettle(10,"Butterfly", "white", 1.9f, "Stainless Steel", 320));
        list.add(new Kettle(9,"Usha", "silver", 1.1f, "Plastic and Metal", 200));
        list.add(new Kettle(8,"Crompton", "black", 1.3f, "Stainless Steel and Plastic", 240));
        Collections.sort(list);
        for (Object object:list){
            System.out.println(object);
        }
    }
}