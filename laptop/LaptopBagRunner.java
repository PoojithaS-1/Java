package com.xworkz.calciapp.laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopBagRunner {
    public static void main(String[] args) {
        List<LaptopBag> list =new ArrayList<>();
        list.add(new LaptopBag(15,"black","Polyester",true,3));
        list.add(new LaptopBag(13,"grey","Nylon",false,2));
        list.add(new LaptopBag(17,"blue","Canvas",true,4));
        list.add(new LaptopBag(14,"red","Leather",false,3));
        list.add(new LaptopBag(16,"brown","Polyurethane",true,5));
        list.add(new LaptopBag(18,"green","Nylon",false,4));
        list.add(new LaptopBag(12,"purple","Canvas",true,2));
        list.add(new LaptopBag(19,"yellow","Polyester",false,5));
        list.add(new LaptopBag(11,"orange","Leather",true,3));
        list.add(new LaptopBag(20,"pink","Polyurethane",false,6));
        Collections.sort(list);
        for (LaptopBag laptopBag: list){
        System.out.println(laptopBag);
    }
    }
}
