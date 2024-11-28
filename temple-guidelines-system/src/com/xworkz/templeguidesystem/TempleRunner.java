package com.xworkz.templeguidesystem;

import com.xworkz.templeguidesystem.templeguidelines.TempleGuidelines;
import com.xworkz.templeguidesystem.templeguidelinesimpl.TempleGuidelinesImpl;

public class TempleRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        TempleGuidelines templeGuidelines=new TempleGuidelinesImpl();
        System.out.println("Temple Guidelines");
        templeGuidelines.removeShoesBeforeEntering();
        templeGuidelines.dressModestly();
        templeGuidelines.maintainSilence();
        templeGuidelines.respectDeityAndIdols();
        templeGuidelines.followPriestsInstructions();
        templeGuidelines.keepMobilePhonesSilent();
        templeGuidelines.avoidEatingInsideTemple();
        templeGuidelines.donateGenerously();
        templeGuidelines.maintainCleanliness();
        templeGuidelines.followTempleRulesAndTraditions();
        System.out.println("Main Ended");
    }
}
