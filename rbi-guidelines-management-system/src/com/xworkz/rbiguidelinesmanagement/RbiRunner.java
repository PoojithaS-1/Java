package com.xworkz.rbiguidelinesmanagement;

import com.xworkz.rbiguidelinesmanagement.axisbank.AxisBank;
import com.xworkz.rbiguidelinesmanagement.canarabank.CanaraBankBangalore;
import com.xworkz.rbiguidelinesmanagement.iob.IobBangalore;
import com.xworkz.rbiguidelinesmanagement.rbiguidelines.RbiGuidlines;
import com.xworkz.rbiguidelinesmanagement.sbi.SbI;

public class RbiRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        RbiGuidlines canara =new CanaraBankBangalore();
        System.out.println("Canara Guidelines:");
        canara.atmTransactionCharges();
        canara.kYCGuidelines();
        canara.creditCardAndDebitCardSecurity();

        RbiGuidlines iob=new IobBangalore();
        System.out.println("IOB Guidelines:");
        iob.kYCGuidelines();
        iob.atmTransactionCharges();
        iob.creditCardAndDebitCardSecurity();

        RbiGuidlines axis=new AxisBank();
        System.out.println("Axis Bank Guidelines: ");
        axis.creditCardAndDebitCardSecurity();
        axis.atmTransactionCharges();
        axis.kYCGuidelines();

        RbiGuidlines sBi=new SbI();
        System.out.println("SBI Guidelines: ");
        sBi.kYCGuidelines();
        sBi.atmTransactionCharges();
        sBi.creditCardAndDebitCardSecurity();
    }
}
