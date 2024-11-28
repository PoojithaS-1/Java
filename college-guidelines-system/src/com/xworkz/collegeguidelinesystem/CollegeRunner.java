package com.xworkz.collegeguidelinesystem;

import com.xworkz.collegeguidelinesystem.collegeguidelines.CollegeGuidelines;
import com.xworkz.collegeguidelinesystem.collegeguidelinesimpl.CollegeGuidelinesImpl;

public class CollegeRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        CollegeGuidelines collegeGuidelines=new CollegeGuidelinesImpl();
        System.out.println("College Guidelines: ");
        collegeGuidelines.attendClassesRegularly();
        collegeGuidelines.submitAssignmentsOnTime();
        collegeGuidelines.respectFacultyAndStaff();
        collegeGuidelines.maintaindisciplineInCampus();
        collegeGuidelines.useCollegeResourcesWisely();
        collegeGuidelines.participateInExtracurricularActivities();
        collegeGuidelines.followDressCode();
        collegeGuidelines.bePunctualForExamsAndTests();
        collegeGuidelines.useLibraryAndOtherFacilitiesResponsibly();
        collegeGuidelines.maintainCleanlinessInCampus();
        System.out.println("Main Ended");
    }
}
