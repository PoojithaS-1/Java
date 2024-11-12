package com.xworkz.hospital;

import com.xworkz.hospital.apollohospital.ApolloHospital;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        ApolloHospital apollo = new ApolloHospital();
        apollo.getHospitalDetails("Apollo", null);
        System.out.println("Main ended");
    }
}
