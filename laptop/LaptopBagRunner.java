package com.xworkz.calciapp.customtype.laptop;

import java.util.LinkedList;

public class LaptopBagRunner {
    public static void main(String[] args) {
        LinkedList<LaptopBag> linkedList=new LinkedList<>();
        linkedList.add(new LaptopBag(15,"black","Polyester",true,3));
        linkedList.add(new LaptopBag(13,"grey","Nylon",false,2));
        linkedList.add(new LaptopBag(17,"blue","Canvas",true,4));
        linkedList.add(new LaptopBag(14,"red","Leather",false,3));
        linkedList.add(new LaptopBag(16,"brown","Polyurethane",true,5));
    for (LaptopBag laptopBag:linkedList){
        System.out.println(laptopBag);
    }
    }
}
