package com.xworkz.kerosineinfo;

import com.xworkz.kerosineinfo.kerosineinfo.KerosineInfo;

public class KerosineRunner {
    public static void main(String[] args) {
        KerosineInfo k1=new KerosineInfo();
        k1.getKerosineInfo();
        KerosineInfo k2=new KerosineInfo(90.00,500,true);
        k2.getKerosineInfo();
        KerosineInfo k3=new KerosineInfo(true);
        k3.getKerosineInfo();
        KerosineInfo k4=new KerosineInfo(95.00);
        k4.getKerosineInfo();
    }
}
