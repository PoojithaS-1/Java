package com.xworkz.calciapp.customtype.ironbox;

import java.util.LinkedList;

public class IronBoxRunner {
    public static void main(String[] args) {
        LinkedList<IronBox> linkedList=new LinkedList<>();
        linkedList.add(new IronBox("Electric","Philence","Philence GC1905",1000.00,false));
        linkedList.add(new IronBox("Gas","Usha","Usha ISI 3711",800.00,true));
        linkedList.add(new IronBox("Electric","Bajaj","Bajaj MX 11",900.00,false));
        linkedList.add(new IronBox("Steam","Philips","Philips GC 503",1200.00,true));
        linkedList.add(new IronBox("Electric","Morphy Richards","Morphy Richards Super Glide",1100.00,false));
    for (IronBox ironBox:linkedList){
        System.out.println(ironBox);
    }
    }
}
