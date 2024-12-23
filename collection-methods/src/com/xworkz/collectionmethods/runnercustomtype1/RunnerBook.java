package com.xworkz.collectionmethods.runnercustomtype1;

import java.util.ArrayList;
import java.util.Collection;

public class RunnerBook {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add(new Book("Java Programming", 123));
        collection1.add(new Book("Data Structures and Algorithms", 678));
        collection1.add(new Book("Computer Networks", 347));
        collection1.add(new Book("Database Systems", 901));
        collection1.add(new Book("Operating System Concepts", 567));

        Collection collection2 = new ArrayList();
        collection2.add(new Book("Web Development", 111));
        collection2.add(new Book("Machine Learning", 222));
        collection2.add(new Book("Artificial Intelligence", 3333));
        collection2.add(new Book("Data Science", 444));
        collection2.add(new Book("Cybersecurity", 555));


        boolean isAdded = collection1.addAll(collection2);
        System.out.println("Data added successfully!! " + isAdded);

        boolean areEqual = collection1.equals(collection2);
        System.out.println(areEqual);

        int size = collection1.size();
        System.out.println("Array size is: " + size);

        boolean contains = collection1.contains(new Book("Java Programming", 123));
        System.out.println(contains);

        boolean containsAll = collection1.containsAll(collection2);
        System.out.println(containsAll);

        // collection1.clear();
        // collection1.remove(new Book("Cybersecurity", 555));
        // collection1.removeAll(collection2);

        System.out.println(collection1);
    }
}
