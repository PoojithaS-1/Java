package com.xworkz.medicalapp;

import com.xworkz.medicalapp.medicalshop.MedicalShop;
import com.xworkz.medicalapp.medicine.Medicine;

public class MedicineRunner {
    public static void main(String[] args){
        Medicine medicine=new Medicine();
        System.out.println(medicine.toString());
        MedicalShop medicalShop=new MedicalShop();
        medicine.setMedicineId(101);
        medicine.setMedicineName("Paracetamol");
        medicine.setMedicineType("Pain reliever, Fever reducer");
        medicine.setDosage("500mg-1000mg");
        medicine.setUsage("Relieving headache, fever, muscle pain");
        System.out.println(medicine.hashCode());
//        System.out.println(medicine);
//        medicalShop.addMedicine(medicine);
//        medicalShop.getMedicineDetails();
        Medicine medicine1 =new Medicine();
        System.out.println(medicine1);
        medicine1.setMedicineId(111);
        medicine1.setMedicineName("Paracetamol");
        medicine1.setMedicineType("Pain reliever, Fever reducer");
        medicine1.setDosage("500mg-1000mg");
        medicine1.setUsage("Relieving headache, fever, muscle pain");
        System.out.println(medicine1.hashCode());
        
        boolean same=medicine.equals(medicine1);
        System.out.println(same);
    }

}

