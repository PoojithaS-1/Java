package com.xworkz.bankguidelinesystem;

import com.xworkz.bankguidelinesystem.bankguidelines.BankGuidelines;
import com.xworkz.bankguidelinesystem.bankguidelinesimpl.BankGuidelinesImpl;

public class BankGuidelinesRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        BankGuidelines bankGuidelines = new BankGuidelinesImpl();
        System.out.println("Bank Guidelines");
        bankGuidelines.maintainAccountBalance();
        bankGuidelines.keepAccountDetailsSecure();
        bankGuidelines.useATMCardSecurely();
        bankGuidelines.avoidSharingAccountDetails();
        bankGuidelines.useOnlineBankingSecurely();
        bankGuidelines.keepChequeBookSecure();
        bankGuidelines.reconcileAccountStatements();
        bankGuidelines.reportLostOrStolenCards();
        bankGuidelines.useBankServicesDuringBusinessHours();
        bankGuidelines.followBankRulesAndRegulations();
        bankGuidelines.respectBankStaff();
        bankGuidelines.maintainCleanlinessInBankPremises();
        bankGuidelines.followSecurityInstructions();
        bankGuidelines.reportSuspiciousTransactions();
        bankGuidelines.useBankFacilitiesResponsibly();
        System.out.println("Main Ended");
    }
}

