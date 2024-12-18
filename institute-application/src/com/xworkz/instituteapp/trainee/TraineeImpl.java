package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.GenderType;
import com.xworkz.instituteapp.exception.*;
import com.xworkz.instituteapp.institute.Institute;

import java.util.Arrays;

public class TraineeImpl implements Institute {
    Trainee trainee[]=null;
    int index=0;

    public TraineeImpl(int size){

        trainee=new Trainee[size];
    }
@Override
    public boolean addTrainee(Trainee trainee){
        if (index < this.trainee.length){
            if (trainee.getId()>0 && trainee.getGender() !=null && trainee.getName()!=null){
                this.trainee[index++]=trainee;
                System.out.println("Trainee added Successfully");
                return true;
            }else {
                System.out.println("Invalid details...");
                return false;
            }
        }else {
            System.out.println("ArrayIndexOutOfBoundsException: Trainee array is full");
            return false;
        }
    }
    @Override
    public void getTraineeInfo(){
        System.out.println("Trainee Info: ");
        for (Trainee trainee1:trainee){
            if (trainee1 != null){
                System.out.println(trainee1);
            }else {
                System.out.println("Trainee Info not available");
            }
        }
    }
    @Override
    public Trainee getNameById(int id){
        System.out.println("GetName By Id");
        Trainee isNameFound= null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getId()==id){
                    isNameFound=trainee1;
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isNameFound==null){
                NameByIdNotFoundException nameByIdNotFoundException=new NameByIdNotFoundException("Name with specified id "+id+" not Found");
                throw nameByIdNotFoundException;
            }
        } catch (NameByIdNotFoundException e) {
            e.printStackTrace();
        }
        return isNameFound;
    }
    @Override
    public Trainee getGenderByName(String name){
        System.out.println("Get Gender By Name");
        Trainee isGenderFound=null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getName().equals(name)){
                    isGenderFound=trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeGender: "+trainee1.getGender());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isGenderFound == null){
                GenderByNameNotFoundException genderByNameNotFoundException=new GenderByNameNotFoundException("Trainee Gender not found");
                throw genderByNameNotFoundException;
            }
        } catch (GenderByNameNotFoundException e) {
            e.printStackTrace();
        }
        return isGenderFound;
    }
    @Override
    public Trainee getNameByGender(GenderType gender){
        System.out.println("GetName By Gender");
        Trainee isNameFoundByGender=null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getGender().equals(gender)){
                    isNameFoundByGender=trainee1;
                    System.out.println("TraineeGender: "+trainee1.getGender());
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isNameFoundByGender==null){
                NameByGenderNotFoundException nameByGenderNotFoundException=new NameByGenderNotFoundException("Name with specified gender not found");
                throw nameByGenderNotFoundException;
            }
        } catch (NameByGenderNotFoundException e) {
            e.printStackTrace();
        }
        return isNameFoundByGender;
    }
    @Override
    public Trainee getPhoneNumberByName(String name){
        System.out.println("GetPhoneNumber By Name");
        Trainee isPhoneNumFound=null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getName().equals(name)){
                    isPhoneNumFound=trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineePhoneNum: "+trainee1.getPhoneNumber());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isPhoneNumFound == null){
               PhoneNumberByNameNotFoundException phoneNumberByNameNotFoundException=new PhoneNumberByNameNotFoundException("Phonenum with specified name not found");
                throw phoneNumberByNameNotFoundException;
            }
        } catch (PhoneNumberByNameNotFoundException e) {
            e.printStackTrace();
        }
        return isPhoneNumFound;
    }
    @Override
    public Trainee getEmailByName(String name){
        System.out.println("GetEmail By Name");
        Trainee isEmailFoundByName=null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getName().equals(name)){
                    isEmailFoundByName=trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeEmail: "+trainee1.getEmail());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isEmailFoundByName==null){
                EmailByNameNotFoundException emailByNameNotFoundException=new EmailByNameNotFoundException("Email with Specified name not found");
                throw emailByNameNotFoundException;
            }
        } catch (EmailByNameNotFoundException e) {
            e.printStackTrace();
        }
        return isEmailFoundByName;
    }
    @Override
    public Trainee getEmailById(int id){
        System.out.println("GetEmail By Id");
        Trainee isEmailFoundById=null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getId()==id){
                    isEmailFoundById=trainee1;
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeEmail: "+trainee1.getEmail());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isEmailFoundById==null){
                EmailByIdNotFoundException emailByIdNotFoundException=new EmailByIdNotFoundException("Email with specified id not found");
                throw emailByIdNotFoundException;
            }
        } catch (EmailByIdNotFoundException e) {
            e.printStackTrace();
        }
        return isEmailFoundById;
    }
    @Override
    public Trainee getDobById(int id){
        System.out.println("GetDoB By Id");
        Trainee isDoBFoundById =null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getId()==id){
                    isDoBFoundById=trainee1;
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeDoB: "+trainee1.getDob());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isDoBFoundById ==null){
                DobByIdNotFoundException dobByIdNotFoundException=new DobByIdNotFoundException("DoB with specified id not found");
                throw dobByIdNotFoundException;
            }
        } catch (DobByIdNotFoundException e) {
            e.printStackTrace();
        }
        return isDoBFoundById;
    }
    @Override
    public Trainee getDegreeNameByName(String name){
        System.out.println("GetDegreeName By Name");
        Trainee isDegreeNameFoundByName =null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getName().equals(name)){
                    isDegreeNameFoundByName =trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeDegreeName: "+trainee1.getDegreeName());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isDegreeNameFoundByName ==null){
                DegreeNameByNameNotFoundException degreeNameByNameNotFoundException=new DegreeNameByNameNotFoundException("Degree name with specified name not found");
                throw degreeNameByNameNotFoundException;
            }
        } catch (DobByIdNotFoundException e) {
            e.printStackTrace();
        }
        return isDegreeNameFoundByName;
    }
    @Override
    public Trainee getYearOfGraduationByDegreeName(String degreeName){
        System.out.println("GetYearOfGraduation By DegreeName");
        Trainee isYearOfGraduationFoundByDegreeName=null;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getDegreeName().equals(degreeName)){
                    isYearOfGraduationFoundByDegreeName=trainee1;
                    System.out.println("TraineeDegreeName: "+trainee1.getDegreeName());
                    System.out.println("TraineeDegreeName: "+trainee1.getYearOfGraduation());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isYearOfGraduationFoundByDegreeName==null){
                YearOfGraduationByDegreeNameNotFoundException yearOfGraduationByDegreeNameNotFoundException=new YearOfGraduationByDegreeNameNotFoundException("YearOfGraduation for specified DegreeName not found");
                throw yearOfGraduationByDegreeNameNotFoundException;
            }
        } catch (YearOfGraduationByDegreeNameNotFoundException e) {
            e.printStackTrace();
        }
        return isYearOfGraduationFoundByDegreeName;
    }
    @Override
    public boolean updateEmailById(int id,String updatedEmail){
        boolean isEmailUpdated=false;
        System.out.println("updateEmail By Id");
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getId()==id){
                    trainee1.setEmail(updatedEmail);
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeDoB: "+trainee1.getDob());
                    System.out.println("TraineeGender: "+trainee1.getGender());
                    System.out.println("TraineeEmail: "+trainee1.getEmail());
                    System.out.println("TraineeDegreeName: "+trainee1.getDegreeName());
                    System.out.println("TraineePhoneNumber: "+trainee1.getPhoneNumber());
                    System.out.println("TraineeYearOfGraduation: "+trainee1.getYearOfGraduation());
                    System.out.println("Is Trainee placed: "+trainee1.isPlaced());
                    System.out.println("__________________________________________________________");
                    isEmailUpdated=true;

                }
            }
            if (isEmailUpdated==false){
                UpdateEmailByIdNotFoundException updateEmailByIdNotFoundException=new UpdateEmailByIdNotFoundException(id+ " not found. Email not updated");
                throw updateEmailByIdNotFoundException;
            }
        } catch (UpdateEmailByIdNotFoundException e) {
            e.printStackTrace();
        }
        return isEmailUpdated;
    }
    @Override
    public boolean updatePhoneNumberByName(String name,long updatedPhoneNum){
        System.out.println("updatePhoneNumber By Name");
        boolean isPhoneNumberUpdatedByName=false;
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getName().equals(name)){
                    trainee1.setPhoneNumber(updatedPhoneNum);
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeDoB: "+trainee1.getDob());
                    System.out.println("TraineeGender: "+trainee1.getGender());
                    System.out.println("TraineeEmail: "+trainee1.getEmail());
                    System.out.println("TraineeDegreeName: "+trainee1.getDegreeName());
                    System.out.println("TraineePhoneNumber: "+trainee1.getPhoneNumber());
                    System.out.println("TraineeYearOfGraduation: "+trainee1.getYearOfGraduation());
                    System.out.println("Is Trainee placed: "+trainee1.isPlaced());
                    System.out.println("__________________________________________________________");

                    isPhoneNumberUpdatedByName=true;
                }
            }
            if (isPhoneNumberUpdatedByName==false){
                UpdatePhoneNumberByNameNotFoundException updatePhoneNumberByNameNotFoundException=new UpdatePhoneNumberByNameNotFoundException(name+" Not Found. PhoneNum not updated");
                throw updatePhoneNumberByNameNotFoundException;
            }
        } catch (UpdatePhoneNumberByNameNotFoundException e) {
            e.printStackTrace();
        }
        return isPhoneNumberUpdatedByName;
    }
    @Override
    public boolean updateisPlacedByName(String name, boolean updatedIsPlaced){
        boolean isPlacedUpdatedByName=false;
        System.out.println("updateisPlaced By Name");
        try {
            for (Trainee trainee1:trainee){
                if (trainee1.getName().equals(name)){
                    trainee1.setPlaced(updatedIsPlaced);
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeDoB: "+trainee1.getDob());
                    System.out.println("TraineeGender: "+trainee1.getGender());
                    System.out.println("TraineeEmail: "+trainee1.getEmail());
                    System.out.println("TraineeDegreeName: "+trainee1.getDegreeName());
                    System.out.println("TraineePhoneNumber: "+trainee1.getPhoneNumber());
                    System.out.println("TraineeYearOfGraduation: "+trainee1.getYearOfGraduation());
                    System.out.println("Is Trainee placed: "+trainee1.isPlaced());
                    System.out.println("__________________________________________________________");
                    isPlacedUpdatedByName=true;
                }
            }
            if (isPlacedUpdatedByName==false){
                UpdateisPlacedByNameNotFoundException updateisPlacedByNameNotFoundException=new UpdateisPlacedByNameNotFoundException(name+ " not found. IsPlaced not updated");
                throw updateisPlacedByNameNotFoundException;
            }
        } catch (UpdateisPlacedByNameNotFoundException e) {
            e.printStackTrace();
        }
        return isPlacedUpdatedByName;
    }
    @Override
    public boolean deleteTraineeById(int id){
        boolean isTraineeDeleted=false;
        int i=0;
        System.out.println("deleteTrainee By Id");
        for (int start=0;start<trainee.length;start++){
            Trainee trainee1=trainee[start];
            if (trainee1.getId()!=id){
                trainee[i++]=trainee[start];
            }else {
                isTraineeDeleted=true;
            }
        }
        int size=i;
        trainee= Arrays.copyOf(trainee,i);
        return isTraineeDeleted;
    }
}
