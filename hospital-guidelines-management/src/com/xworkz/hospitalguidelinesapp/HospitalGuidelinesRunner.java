package com.xworkz.hospitalguidelinesapp;

import com.xworkz.hospitalguidelinesapp.hospitalguidelines.HospitalGuidelines;
import com.xworkz.hospitalguidelinesapp.hospitalguidelinesimpl.HospitalGuidelinesImpl;

public class HospitalGuidelinesRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        HospitalGuidelines hospitalGuidelines=new HospitalGuidelinesImpl();
        System.out.println("Hospital Guidelines: ");
        hospitalGuidelines.followMedicationInstructions();
        hospitalGuidelines.maintainHygiene();
        hospitalGuidelines.respectPatientPrivacy();
        System.out.println("Main Ended");
    }
}
