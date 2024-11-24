package com.xworkz.instituteapp.trainee;

import com.xworkz.instituteapp.constants.GenderType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Trainee {
    private int id ;
    private String name ;
    private int yearOfGraduation ;
    private String degreeName ;
    private String dob ;
    private String email ;
    private GenderType gender ;
    private long phoneNumber ;
    private boolean isPlaced ;
}
