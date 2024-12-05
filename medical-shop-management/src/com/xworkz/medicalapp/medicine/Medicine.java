package com.xworkz.medicalapp.medicine;

import java.util.Objects;

public class Medicine {
    private int medicineId;
    private String medicineName;
    private String medicineType;
    private String dosage;
    private String usage;

    public Medicine(){
        System.out.println("Medicine constructor invoked");
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDosage() {
        return dosage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUsage() {
        return usage;
    }
//    @Override
//    public String toString(){
//        return "Medicine-medicineId= "+this.medicineId+","+
//                "medicineName= "+this.medicineName+","+
//                "medicineType= "+this.medicineType+","+
//                "dosage= "+this.dosage+","+
//                "usage= "+this.usage;
//    }


    @Override
    public boolean equals(Object obj) {
        Medicine medicine=(Medicine) obj;
        if (this.hashCode()==medicine.hashCode())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return this.medicineId;
    }
}
