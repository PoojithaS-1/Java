package com.xworkz.company.company;

public class Company {
    public Company() {
        System.out.println("Company constructor is invoked");
    }

    public void getCompanyDetails(String name, String industry) {
        System.out.println("Company Name: " + name);
        System.out.println("Industry: " + industry);
    }
}
