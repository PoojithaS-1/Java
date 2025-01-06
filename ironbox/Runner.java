package com.xworkz.calciapp.ironbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        LinkedList<Iron> list=new LinkedList<>();
        list.add(new Iron(5,"Electric","Philence","Philence GC1905",1000.00,false));
        list.add(new Iron(2,"Gas","Usha","Usha ISI 3711",800.00,true));
        list.add(new Iron(4,"Electric","Philence","Philence GC1905",1000.00,false));
        list.add(new Iron(7,"Electric","Bajaj","Bajaj Majesty DX 11",1200.00,true));
        list.add(new Iron(9,"Gas","Prestige","Prestige PGI 03",900.00,false));
        list.add(new Iron(1,"Electric","Morphy Richards","Morphy Richards Super Glide 2000W",1500.00,true));
        Collections.sort(list);
        for (Object ref:list){
            System.out.println(ref);
        }
    }
}
