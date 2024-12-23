package com.xworkz.collectionmethods.runnerusingstring;

import java.util.ArrayList;
import java.util.Collection;

public class RunnerUsingString {
    public static void main(String[] args) {
        Collection collection1=new ArrayList();
        collection1.add("Poojitha");
        collection1.add("Divya");
        collection1.add("Keerthi");
        collection1.add("Navya");
        collection1.add("Sneha");

        Collection collection2=new ArrayList();
        collection2.add("Rashmi");
        collection2.add("Anusha");
        collection2.add("Supriya");
        collection2.add("Sushma");
        collection2.add("Priyanka");

        boolean isAdded = collection1.addAll(collection2);
        System.out.println("Data added successfully!! "+isAdded);

        boolean areEqual = collection1.equals(collection2);
        System.out.println(areEqual);

        int size= collection1.size();
        System.out.println("Array size is: "+size);

        boolean contains=collection1.contains("Sushma");
        System.out.println(contains);

        boolean containsAll=collection1.containsAll(collection2);
        System.out.println(containsAll);


//        collection1.clear();
//        collection1.remove("Poojitha");
//        collection1.removeAll(collection2);



        System.out.println(collection1);
    }
}


