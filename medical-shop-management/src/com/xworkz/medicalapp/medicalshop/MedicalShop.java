package com.xworkz.medicalapp.medicalshop;

import com.xworkz.medicalapp.medicine.Medicine;

public class MedicalShop {
    Medicine medicine;
    public boolean addMedicine(Medicine medicine){
        boolean isMedicineAdded=false;
        if (medicine != null){
            if(medicine.getMedicineId()>0 && medicine.getMedicineName()!=null){
                this.medicine=medicine;
                isMedicineAdded=true;
            }
            else{
                System.out.println("Medicine not added");
            }
        }
        return isMedicineAdded;
    }
    public void getMedicineDetails(){
        System.out.println("MedicineId is: "+medicine.getMedicineId());
        System.out.println("MedicineName is: "+medicine.getMedicineName());
        System.out.println("medicineType is: "+medicine.getMedicineType());
        System.out.println("Dosage is: "+medicine.getDosage());
        System.out.println("Usage: "+medicine.getUsage());
    }
}
