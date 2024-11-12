package com.xworkz.institutes.institution;

public class Institution {
    public Institution() {
        System.out.println("Institution constructor is invoked");
    }
    public void getInstitutionDetails(String name, String location) {
        System.out.println("Institution Name: " + name);
        System.out.println("Location: " + location);
    }
}
