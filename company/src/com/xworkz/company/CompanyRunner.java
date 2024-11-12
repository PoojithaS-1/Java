package com.xworkz.company;

import com.xworkz.company.cognizant.Cognizant;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Cognizant cognizant = new Cognizant();
        cognizant.getCompanyDetails("Cognizant", null);
        System.out.println("Main ended");
    }
}
