package com.xworkz.hospital.hospital;

public class Hospital {
    public Hospital() {
        System.out.println("Hospital constructor is invoked");
    }

    public void getHospitalDetails(String name, String location) {
        if (name != null) {
            System.out.println("Hospital Name: " + name);
        } else {
            System.out.println("Hospital name cannot be null or empty.");
        }
        if (location != null) {
            System.out.println("Location: " + location);
        } else {
            System.out.println("Location cannot be null or empty.");
        }
    }
}
