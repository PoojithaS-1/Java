package com.xworkz.institutes;

import com.xworkz.institutes.xworkz.Xworkz;

public class InstituteRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Xworkz xworkz = new Xworkz();
        xworkz.getInstitutionDetails("Xworkz", "Bengaluru");
        System.out.println("Main ended");
    }
}
