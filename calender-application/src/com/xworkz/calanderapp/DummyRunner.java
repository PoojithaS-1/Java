package com.xworkz.calanderapp;

public class DummyRunner {

    static String str=null; // NullPointerException
    public static void main(String[] args) {
        m();// StackOverflowError
//        str.length();// NullPointerException
    }
    public static void m(){  // StackOverflowError
        m();
    }
}
