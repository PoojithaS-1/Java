package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MedicalShop;
import com.xworkz.medicalapp.medicine.Medicine;

public class MedicineRunner {
    public static void main(String[] args){
        Medicine medicine=new Medicine();
        System.out.println(medicine.toString());
        MedicalShop medicalShop=new MedicalShop();
        medicine.setMedicineId(111);
        medicine.setMedicineName("Paracetamol");
        medicine.setMedicineType("Pain reliever, Fever reducer");
        medicine.setDosage("500mg-1000mg");
        medicine.setUsage("Relieving headache, fever, muscle pain");
        System.out.println(medicine);
        medicalShop.addMedicine(medicine);
        medicalShop.getMedicineDetails();
    }
}
