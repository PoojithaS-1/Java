package com.xworkz.aeroplaneinfo.aeroplane;

import com.xworkz.aeroplaneinfo.aeroplane.Aeroplane;

public class AeroplaneRunner {
    public static void main(String[] args) {
        Aeroplane a1 = new Aeroplane();
        a1.getAeroplaneInfo();

        Aeroplane a2 = new Aeroplane("Airbus", "Mumbai", "Chennai");
        a2.getAeroplaneInfo();

        Aeroplane a3 = new Aeroplane("Indigo", 7000.0, "Hyderabad", "Kolkata");
        a3.getAeroplaneInfo();

        Aeroplane a4 = new Aeroplane("SpiceJet", 200, 6000.0, "Pune", "Jaipur");
        a4.getAeroplaneInfo();
    }
}
