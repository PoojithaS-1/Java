package com.xworkz.calciapp.laptop;

import com.xworkz.calciapp.laptop.Comparator.LaptopColorComparator;
import com.xworkz.calciapp.laptop.Comparator.LaptopMaterialComparator;
import com.xworkz.calciapp.laptop.Comparator.LaptopSizeComparator;
import com.xworkz.calciapp.laptop.Comparator.NoOfCompartmentsComparator;

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

        System.out.println("Comparable sorting by Size: ");
        Collections.sort(list);
        for (Object object: list){
        System.out.println(object);
    }
        System.out.println();
        System.out.println("Size sorting: ");
        Collections.sort(list,new LaptopSizeComparator());
        for (Object object:list ){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Color sorting: ");
        Collections.sort(list,new LaptopColorComparator());
        for (Object object:list ){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Material sorting: ");
        Collections.sort(list,new LaptopMaterialComparator());
        for (Object object:list ){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Number of compartments sorting: ");
        Collections.sort(list,new NoOfCompartmentsComparator());
        for (Object object:list ){
            System.out.println(object);
        }
    }
}
