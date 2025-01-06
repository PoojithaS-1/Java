package com.xworkz.calciapp.helmet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HelmetRunner {
    public static void main(String[] args) {
        List<Helmet> list =new ArrayList<>();
        list.add(new Helmet(1, "Black", "Axor", "MotorCycle", 1600, "Acrylonitrile Butadiene Styrene (ABS)"));
        list.add(new Helmet(8, "White", "Studds", "Scooter", 1200, "Acrylonitrile Butadiene Styrene (ABS)"));
        list.add(new Helmet(4, "Red", "Vega", "MotorCycle", 2000, "Fiberglass"));
        list.add(new Helmet(79, "Blue", "LS2", "Off-Road", 1800, "Polycarbonate"));
        list.add(new Helmet(67, "Grey", "HJC", "Street", 1500, "Acrylonitrile Butadiene Styrene (ABS)"));
        list.add(new Helmet(23, "Silver", "AGV", "Off-Road", 2200, "Fiberglass"));
        list.add(new Helmet(11, "Yellow", "Arai", "Street", 2500, "Acrylonitrile Butadiene Styrene (ABS)"));
        list.add(new Helmet(42, "Green", "Shoei", "MotorCycle", 2800, "Polycarbonate"));
        list.add(new Helmet(85, "Orange", "Bell", "Scooter", 1000, "Acrylonitrile Butadiene Styrene (ABS)"));
        list.add(new Helmet(31, "Purple", "Schuberth", "Off-Road", 2000, "Fiberglass"));
        Collections.sort(list);
        for (Helmet helmet: list){
            System.out.println(helmet);
        }
    }
}
