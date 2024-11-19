package com.xworkz.governmentsystem.stategovernment;

import com.xworkz.governmentsystem.government.Government;

public class StateGovernment extends Government {
    public static boolean isBplCardAvailable;


    @Override
    public void freeEducation(){
        System.out.println("invoked from state government class ");
        if(isBplCardAvailable==false){
            System.out.println("Free education for all students under the age of 15");
        }else {
            System.out.println("No free education");
        }

    }
}
