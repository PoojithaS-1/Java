package com.xworkz.calciapp.helmet;

import com.xworkz.calciapp.helmet.comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelmetRunner {
    public static void main(String[] args) {
        List<Helmet> list =new ArrayList<>();
        list.add(new Helmet(1, "Black", "Axor", "MotorCycle", 1600, "Acrylonitrile Butadiene Styrene (ABS)"));
        list.add(new Helmet(8, "White", "Studds", "Scooter", 1200, "Acrylonitrile Butadiene Styrene (ABS)"));
        list.add(new Helmet(4, "Red", "Vega", "MotorCycle", 2000, "Fiberglass"));
        list.add(new Helmet(79, "Blue", "LS2", "Off-Road", 1800, "Polycarbonate"));
        list.add(new Helmet(67, "Grey", "HJC", "Street", 1500, "Acrylonitrile Butadiene Styrene (ABS)"));

        System.out.println("Comparable sorting for brand: ");
        Collections.sort(list);
        for (Object object : list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Id sorting: ");
        Collections.sort(list,new HelmateIdComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Color sorting: ");
        Collections.sort(list,new ColorComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Brand sorting: ");
        Collections.sort(list,new HelmateBrandComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("VehicleServiceType sorting: ");
        Collections.sort(list,new VehicleServiceTypeComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("ItemWeight sorting: ");
        Collections.sort(list,new ItemWeightComparator());
        for(Object object:list){
            System.out.println(object);
        }
        System.out.println();
        System.out.println("Material sorting: ");
        Collections.sort(list,new HelmetMaterialComparator());
        for(Object object:list){
            System.out.println(object);
        }

    }
}
