package com.xworkz.rbiguidelinesmanagement.axisbank;

import com.xworkz.rbiguidelinesmanagement.rbiguidelines.RbiGuidlines;

public class AxisBank implements RbiGuidlines {
    @Override
    public void atmTransactionCharges() {
        System.out.println("Axis Bank is following atmTransactionCharges guideline");
    }

    @Override
    public void kYCGuidelines() {
        System.out.println("Axis Bank is following kYCGuidelines");
    }

    @Override
    public void creditCardAndDebitCardSecurity() {
        System.out.println("Axis Bank is following creditCardAndDebitCardSecurity");
    }
}
