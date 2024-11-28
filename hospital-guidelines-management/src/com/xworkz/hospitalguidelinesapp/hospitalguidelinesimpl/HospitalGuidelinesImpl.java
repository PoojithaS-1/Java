package com.xworkz.hospitalguidelinesapp.hospitalguidelinesimpl;

import com.xworkz.hospitalguidelinesapp.hospitalguidelines.HospitalGuidelines;

public class HospitalGuidelinesImpl implements HospitalGuidelines {
    @Override
    public void followMedicationInstructions() {
        System.out.println("Guideline 1: Hospitals should follow Medication Instructions");
    }

    @Override
    public void maintainHygiene() {
        System.out.println("Guideline 2: Hospitals should maintain Hygiene");
    }

    @Override
    public void respectPatientPrivacy() {
        System.out.println("Guideline 3: Hospitals should respect Patient Privacy");
    }
}
