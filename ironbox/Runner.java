package com.xworkz.calciapp.ironbox;

import com.xworkz.calciapp.ironbox.comparator.IronboxBrandComparator;
import com.xworkz.calciapp.ironbox.comparator.IronboxIdComparator;
import com.xworkz.calciapp.ironbox.comparator.IronboxModelComparator;
import com.xworkz.calciapp.ironbox.comparator.IronboxTypeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<IronBox> list=new ArrayList<>();
        list.add(new IronBox(5,"Electric","Philence","Philence GC1905",1000.00,false));
        list.add(new IronBox(2,"Gas","Usha","Usha ISI 3711",800.00,true));
        list.add(new IronBox(4,"Electric","Philence","Philence GC1905",1000.00,false));
        list.add(new IronBox(7,"Electric","Bajaj","Bajaj Majesty DX 11",1200.00,true));
        list.add(new IronBox(9,"Gas","Prestige","Prestige PGI 03",900.00,false));
        list.add(new IronBox(1,"Electric","Morphy Richards","Morphy Richards Super Glide 2000W",1500.00,true));
        System.out.println("Comparable Sorting by Id: ");
        Collections.sort(list);
        for (Object ref:list){
            System.out.println(ref);
        }
        System.out.println();
        System.out.println("Id Sorting: ");
        Collections.sort(list,new IronboxIdComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Type Sorting: ");
        Collections.sort(list,new IronboxTypeComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Brand Sorting: ");
        Collections.sort(list,new IronboxBrandComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Model Sorting: ");
        Collections.sort(list,new IronboxModelComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Model Sorting: ");
        Collections.sort(list,new IronboxModelComparator());
        for(Object object:list){
            System.out.println(object);
        }
    }
}
