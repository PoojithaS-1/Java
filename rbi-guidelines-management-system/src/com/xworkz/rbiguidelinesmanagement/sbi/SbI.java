package com.xworkz.rbiguidelinesmanagement.sbi;

import com.xworkz.rbiguidelinesmanagement.rbiguidelines.RbiGuidlines;

public class SbI implements RbiGuidlines {
    @Override
    public void atmTransactionCharges() {
        System.out.println("SBI is following atmTransactionCharges guideline");
    }

    @Override
    public void kYCGuidelines() {
        System.out.println("SBI is following kYCGuidelines");
    }

    @Override
    public void creditCardAndDebitCardSecurity() {
        System.out.println("SBI is following creditCardAndDebitCardSecurity");
    }
}
