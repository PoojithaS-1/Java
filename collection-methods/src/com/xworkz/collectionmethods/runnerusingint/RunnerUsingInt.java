package com.xworkz.collectionmethods.runnerusingint;

import java.util.ArrayList;
import java.util.Collection;

public class RunnerUsingInt {
    public static void main(String[] args) {
        Collection collection1=new ArrayList();
        collection1.add(1);
        collection1.add(2);
        collection1.add(3);
        collection1.add(4);
        collection1.add(5);

        Collection collection2=new ArrayList();
        collection2.add(6);
        collection2.add(7);
        collection2.add(8);
        collection2.add(9);
        collection2.add(10);


        boolean isAdded = collection1.addAll(collection2);
        System.out.println("Data added successfully!! "+isAdded);

        boolean areEqual = collection1.equals(collection2);
        System.out.println(areEqual);

        int size =collection1.size();
        System.out.println("Size of array: "+size);

        boolean contains =collection1.contains(4);
        System.out.println(contains);

        boolean containsAll =collection1.containsAll(collection2);
        System.out.println(containsAll);


//        collection1.clear();
//        collection1.remove(4);
//        collection1.removeAll(collection2);


        System.out.println(collection1);

    }
}
