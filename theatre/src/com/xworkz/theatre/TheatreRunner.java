package com.xworkz.theatre;

import com.xworkz.theatre.pvr.Pvr;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Pvr pvr = new Pvr();
        pvr.getTheatreDetails("PVR Cinemas", "Bangalore");
        System.out.println("Main Ended");
    }
}
