package com.xworkz.instituteapp;

import com.xworkz.instituteapp.constants.GenderType;
import com.xworkz.instituteapp.trainee.Trainee;
import com.xworkz.instituteapp.trainee.TraineeImpl;

import java.util.Scanner;

public class InstituteTraineeRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of trainee info to be added: ");
        int size=scanner.nextInt();
        TraineeImpl trainee=new TraineeImpl(size);
        for (int i=0;i<size;i++) {
            Trainee trainee1 = new Trainee();
            System.out.println("Enter id: ");
            trainee1.setId(scanner.nextInt());
            System.out.println("Enter Name: ");
            trainee1.setName(scanner.next());
            System.out.println("Enter DOB: ");
            trainee1.setDob(scanner.next());
            System.out.println("Enter genderType: ");
            trainee1.setGender(GenderType.valueOf(scanner.next().toUpperCase()));
            System.out.println("Enter Email: ");
            trainee1.setEmail(scanner.next());
            System.out.println("Enter degree name: ");
            trainee1.setDegreeName(scanner.next());
            System.out.println("Enter Year of Graduation: ");
            trainee1.setYearOfGraduation(scanner.nextInt());
            System.out.println("Phone no: ");
            trainee1.setPhoneNumber(scanner.nextLong());
            System.out.println("Is placed: ");
            trainee1.setPlaced(scanner.nextBoolean());

            trainee.addTrainee(trainee1);
        }
        String input=null;
        do{
            System.out.println("1.get all TraineeInfo ");
            System.out.println("2.get Name By Id");
            System.out.println("3.get Gender By Name");
            System.out.println("4.get Name By Gender");
            System.out.println("5.get Phone Number By Name");
            System.out.println("6.get Email By Name");
            System.out.println("7.get Email By Id");
            System.out.println("8.get Dob By Id");
            System.out.println("9.get DegreeName By Name");
            System.out.println("10.get YearOfGraduation By DegreeName");
            System.out.println("11.update Email By Id");
            System.out.println("12.update PhoneNumber By Name");
            System.out.println("13.update isPlaced By Name");
            System.out.println("14.delete Trainee By Id");

            int option=scanner.nextInt();
            switch (option){
                case 1:
                    trainee.getTraineeInfo();
                    break;
                case 2:
                    System.out.println("Enter id of trainee: ");
                    trainee.getNameById(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the Name: ");
                    trainee.getGenderByName(scanner.next());
                    break;
                case 4:
                    System.out.println("Enter the Gender: ");
                    trainee.getNameByGender(GenderType.valueOf(scanner.next().toUpperCase()));
                    break;
                case 5:
                    System.out.println("Enter the Name: ");
                    trainee.getPhoneNumberByName(scanner.next());
                    break;
                case 6:
                    System.out.println("Enter the name: ");
                    trainee.getEmailByName(scanner.next());
                    break;
                case 7:
                    System.out.println("Enter the Id: ");
                    trainee.getEmailById(scanner.nextInt());
                    break;
                case 8:
                    System.out.println("Enter id: ");
                    trainee.getDobById(scanner.nextInt());
                    break;
                case 9:
                    System.out.println("Enter the Name: ");
                    trainee.getDegreeNameByName(scanner.next());
                    break;
                case 10:
                    System.out.println("Enter the DegreeName: ");
                    trainee.getYearOfGraduationByDegreeName(scanner.next());
                    break;
                case 11:
                    System.out.println("Enter updated Email: ");
                    String email=scanner.next();
                    System.out.println("Enter existing id: ");
                    int id=scanner.nextInt();
                    trainee.getTraineeInfo();
                    trainee.updateEmailById(id,email);
                    trainee.getTraineeInfo();
                    break;
                case 12:
                    System.out.println("Enter updated Phone number: ");
                    long phno=scanner.nextLong();
                    System.out.println("Enter name: ");
                    String existingName=scanner.next();
                    trainee.getTraineeInfo();
                    trainee.updatePhoneNumberByName(existingName,phno);
                    trainee.getTraineeInfo();
                    break;
                case 13:
                    System.out.println("Updated info of is placed ?: ");
                    Boolean isPlaced=scanner.nextBoolean();
                    System.out.println("Enter the name: ");
                    String name=scanner.next();
                    trainee.getTraineeInfo();
                    trainee.updateisPlacedByName(name,isPlaced);
                    trainee.getTraineeInfo();
                    break;
                case 14:
                    System.out.println("Enter the id to be deleted: ");
                    trainee.deleteTraineeById(scanner.nextInt());
                    System.out.println("Deleted Successfully...!");
                    break;
                default:
                    System.out.println("Enter valid option...");
            }
            System.out.println("Do you want to continue? Y/N");
            input=scanner.next();
        }while (input.equalsIgnoreCase("Y"));
        System.out.println("Thank you for your co-operation!");


        System.out.println("Main ended");

    }
}
