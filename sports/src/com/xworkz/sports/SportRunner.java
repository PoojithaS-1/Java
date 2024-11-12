package com.xworkz.sports;

import com.xworkz.sports.cricket.Cricket;

public class SportRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Cricket cricket = new Cricket();
        cricket.getSportDetails("Cricket", 11);
        System.out.println("Main Ended");
    }
}
