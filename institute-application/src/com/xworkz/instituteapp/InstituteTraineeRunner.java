package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.GenderType;
import com.xworkz.instituteapp.institute.Institute;
import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.trainee.TraineeImpl;

public class InstituteTraineeRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Trainee trainee1 =new Trainee();
        trainee1.setId(1);
        trainee1.setName("Poojitha");
        trainee1.setDob("01-09-2000");
        trainee1.setGender(GenderType.FEMALE);
        trainee1.setEmail("pooja@gmail.com");
        trainee1.setDegreeName("MCA");
        trainee1.setYearOfGraduation(2024);
        trainee1.setPhoneNumber(9980604566L);
        trainee1.setPlaced(false);

        TraineeImpl trainee=new TraineeImpl();

        trainee.addTrainee(trainee1);

        Trainee trainee2 =new Trainee();
        trainee2.setId(2);
        trainee2.setName("Poorna");
        trainee2.setDob("03-09-2001");
        trainee2.setGender(GenderType.MALE);
        trainee2.setEmail("poorna@gmail.com");
        trainee2.setDegreeName("MBA");
        trainee2.setYearOfGraduation(2024);
        trainee2.setPhoneNumber(9000604006L);
        trainee2.setPlaced(true);

        trainee.addTrainee(trainee2);

        Trainee trainee3 =new Trainee();
        trainee3.setId(3);
        trainee3.setName("Poornima");
        trainee3.setDob("22-02-2001");
        trainee3.setGender(GenderType.FEMALE);
        trainee3.setEmail("poornima@gmail.com");
        trainee3.setDegreeName("MBA");
        trainee3.setYearOfGraduation(2022);
        trainee3.setPhoneNumber(9009904006L);
        trainee3.setPlaced(true);

        trainee.addTrainee(trainee3);

        Trainee trainee4 =new Trainee();
        trainee4.setId(4);
        trainee4.setName("Kavana");
        trainee4.setDob("12-04-2001");
        trainee4.setGender(GenderType.FEMALE);
        trainee4.setEmail("kavana@gmail.com");
        trainee4.setDegreeName("MCA");
        trainee4.setYearOfGraduation(2024);
        trainee4.setPhoneNumber(8000604006L);
        trainee4.setPlaced(false);

        trainee.addTrainee(trainee4);

        Trainee trainee5 =new Trainee();
        trainee5.setId(5);
        trainee5.setName("Kavya");
        trainee5.setDob("23-09-2003");
        trainee5.setGender(GenderType.MALE);
        trainee5.setEmail("poorna@gmail.com");
        trainee5.setDegreeName("MBA");
        trainee5.setYearOfGraduation(2026);
        trainee5.setPhoneNumber(9000604776L);
        trainee5.setPlaced(false);

        trainee.addTrainee(trainee5);

        Trainee trainee6 =new Trainee();
        trainee6.setId(6);
        trainee6.setName("Kiran");
        trainee6.setDob("25-11-2000");
        trainee6.setGender(GenderType.FEMALE);
        trainee6.setEmail("kiran@gmail.com");
        trainee6.setDegreeName("BE");
        trainee6.setYearOfGraduation(2023);
        trainee6.setPhoneNumber(9300604006L);
        trainee6.setPlaced(true);

        trainee.addTrainee(trainee6);

        Trainee trainee7 =new Trainee();
        trainee7.setId(7);
        trainee7.setName("Poorna");
        trainee7.setDob("03-09-2001");
        trainee7.setGender(GenderType.MALE);
        trainee7.setEmail("poorna@gmail.com");
        trainee7.setDegreeName("MBA");
        trainee7.setYearOfGraduation(2024);
        trainee7.setPhoneNumber(9000604006L);
        trainee7.setPlaced(true);

        trainee.addTrainee(trainee7);

        trainee.getTraineeInfo();

        trainee.getNameById(2);

        trainee.getGenderByName("Poornima");

        trainee.getNameByGender(GenderType.FEMALE);

        trainee.getPhoneNumberByName("Kavana");

        trainee.getEmailByName("Kavya");

        trainee.getEmailById(6);

        trainee.getDobById(4);

        trainee.getDegreeNameByName("Poorna");

        trainee.getYearOfGraduationByDegreeName("MCA");

        trainee.updateEmailById(2,"poornaa@gmail.com");

        trainee.updatePhoneNumberByName("Poojitha",9980604600l);

        trainee.updateisPlacedByName("Poojitha",true);

        trainee.deleteTraineeById(5);

        trainee.getTraineeInfo();

        System.out.println("Main ended");

    }
}
