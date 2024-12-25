package com.xworkz.collectionheirarchyclass;

import java.util.Collection;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Collection collection5=new Vector();
        collection5.add("java");
        collection5.add("python");
        collection5.add("c");
        collection5.add("sql");
        collection5.add("mongodb");
        collection5.add("machine learning");
        collection5.add("web technology");
        System.out.println("Vector: "+collection5);//same order as it is inserted
    }
}
