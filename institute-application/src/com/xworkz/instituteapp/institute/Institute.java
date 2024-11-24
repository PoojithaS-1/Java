package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.constants.GenderType;
import com.xworkz.instituteapp.trainee.Trainee;

import java.util.Arrays;

public class Institute {
        Trainee trainee[]=new Trainee[6];
        int index=0;

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

        public void getTraineeInfo(){
            System.out.println("Trainee Info: ");
            for (Trainee trainee1:trainee){
                if (trainee1 != null){
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
                }else {
                    System.out.println("Trainee Info not available");
                }
            }
        }
        public Trainee getNameById(int id){
            System.out.println("GetName By Id");
            Trainee isNameFound= null;
            for (Trainee trainee1:trainee){
                if (trainee1.getId()==id){
                    isNameFound=trainee1;
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isNameFound==null){
                System.out.println("Name with specified id not Found");
            }
            return isNameFound;
        }
        public Trainee getGenderByName(String name){
            System.out.println("GetGender By Name");
            Trainee isGenderFound=null;
            for (Trainee trainee1:trainee){
                if (trainee1.getName()==name){
                    isGenderFound=trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeGender: "+trainee1.getGender());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isGenderFound == null){
                System.out.println("Trainee Gender not found");
            }
            return isGenderFound;
        }

        public Trainee getNameByGender(GenderType gender){
            System.out.println("GetName By Gender");
            Trainee isNameFoundByGender=null;
            for (Trainee trainee1:trainee){
                if (trainee1.getGender()==gender){
                    isNameFoundByGender=trainee1;
                    System.out.println("TraineeGender: "+trainee1.getGender());
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isNameFoundByGender==null){
                System.out.println("Name with specified gender not found");
            }
            return isNameFoundByGender;
        }
        public Trainee getPhoneNumberByName(String name){
            System.out.println("GetPhoneNumber By Name");
            Trainee isPhoneNumFound=null;
            for (Trainee trainee1:trainee){
                if (trainee1.getName()==name){
                    isPhoneNumFound=trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineePhoneNum: "+trainee1.getPhoneNumber());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isPhoneNumFound == null){
                System.out.println("Phonenum with specified name not found");
            }
            return isPhoneNumFound;
        }

        public Trainee getEmailByName(String name){
            System.out.println("GetEmail By Name");
            Trainee isEmailFoundByName=null;
            for (Trainee trainee1:trainee){
                if (trainee1.getName()==name){
                    isEmailFoundByName=trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeEmail: "+trainee1.getEmail());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isEmailFoundByName==null){
                System.out.println("Email with Specified name not found");
            }
            return isEmailFoundByName;
        }

        public Trainee getEmailById(int id){
            System.out.println("GetEmail By Id");
            Trainee isEmailFoundById=null;
            for (Trainee trainee1:trainee){
                if (trainee1.getId()==id){
                    isEmailFoundById=trainee1;
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeEmail: "+trainee1.getEmail());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isEmailFoundById==null){
                System.out.println("Email with specified id not found");
            }
            return isEmailFoundById;
        }

        public Trainee getDobById(int id){
            System.out.println("GetDoB By Id");
            Trainee isDoBFoundById =null;
            for (Trainee trainee1:trainee){
                if (trainee1.getId()==id){
                    isDoBFoundById=trainee1;
                    System.out.println("TraineeId: "+trainee1.getId());
                    System.out.println("TraineeDoB: "+trainee1.getDob());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isDoBFoundById ==null){
                System.out.println("DoB with specified id not found");
            }
            return isDoBFoundById;
        }
        public Trainee getDegreeNameByName(String name){
            System.out.println("GetDegreeName By Name");
            Trainee isDegreeNameFoundByName =null;
            for (Trainee trainee1:trainee){
                if (trainee1.getName()==name){
                    isDegreeNameFoundByName =trainee1;
                    System.out.println("TraineeName: "+trainee1.getName());
                    System.out.println("TraineeDegreeName: "+trainee1.getDegreeName());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isDegreeNameFoundByName ==null){
                System.out.println("Degree name with specified name not found");
            }
            return isDegreeNameFoundByName;
        }

        public Trainee getYearOfGraduationByDegreeName(String degreeName){
            System.out.println("GetYearOfGraduation By DegreeName");
            Trainee isYearOfGraduationFoundByDegreeName=null;
            for (Trainee trainee1:trainee){
                if (trainee1.getDegreeName()==degreeName){
                    isYearOfGraduationFoundByDegreeName=trainee1;
                    System.out.println("TraineeDegreeName: "+trainee1.getDegreeName());
                    System.out.println("TraineeDegreeName: "+trainee1.getYearOfGraduation());
                    System.out.println("__________________________________________________________");
                }
            }
            if (isYearOfGraduationFoundByDegreeName==null){
                System.out.println("YearOfGraduation for specified DegreeName not found");
            }
            return isYearOfGraduationFoundByDegreeName;
        }

        public boolean updateEmailById(int id,String updatedEmail){
            boolean isEmailUpdated=false;
            System.out.println("updateEmail By Id");
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
                System.out.println(id+ " not found. Email not updated");
            }
            return isEmailUpdated;
        }

        public boolean updatePhoneNumberByName(String name,long updatedPhoneNum){
            System.out.println("updatePhoneNumber By Name");
            boolean isPhoneNumberUpdatedByName=false;
            for (Trainee trainee1:trainee){
                if (trainee1.getName()==name){
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
                System.out.println(name+" Not Found. PhoneNum not updated");
            }
            return isPhoneNumberUpdatedByName;
        }

        public boolean updateisPlacedByName(String name, boolean updatedIsPlaced){
            boolean isPlacedUpdatedByName=false;
            System.out.println("updateisPlaced By Name");
            for (Trainee trainee1:trainee){
                if (trainee1.getName()==name){
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
                System.out.println(name+ " not found. IsPlaced not updated");
            }
            return isPlacedUpdatedByName;
        }

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
