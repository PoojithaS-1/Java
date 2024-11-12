package com.xworkz.electronics;

import com.xworkz.electronics.headset.HeadSet;

public class ElectronicGadgetRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        HeadSet headSet=new HeadSet();
        headSet.getGadgetDetails("JBL", "Bluetooth");
        System.out.println("Main Ended");
    }
}
