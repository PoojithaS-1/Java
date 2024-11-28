package com.xworkz.rbiguidelinesmanagement.iob;

import com.xworkz.rbiguidelinesmanagement.rbiguidelines.RbiGuidlines;

public abstract class IoB implements RbiGuidlines {
    @Override
    public void atmTransactionCharges() {
        System.out.println("IOB is following atmTransactionCharges guideline");
    }

    @Override
    public void creditCardAndDebitCardSecurity() {
        System.out.println("IOB is following creditCardAndDebitCardSecurity");
    }

}
