package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.constants.GenderType;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Arrays;

public interface Institute {


    public boolean addTrainee(Trainee trainee);

    public void getTraineeInfo();

    public Trainee getNameById(int id);

    public Trainee getGenderByName(String name);


    public Trainee getNameByGender(GenderType gender);

    public Trainee getPhoneNumberByName(String name);


    public Trainee getEmailByName(String name);


    public Trainee getEmailById(int id);


    public Trainee getDobById(int id);

    public Trainee getDegreeNameByName(String name);

    public Trainee getYearOfGraduationByDegreeName(String degreeName);

    public boolean updateEmailById(int id,String updatedEmail);

    public boolean updatePhoneNumberByName(String name,long updatedPhoneNum);

    public boolean updateisPlacedByName(String name, boolean updatedIsPlaced);

    public boolean deleteTraineeById(int id);
}
