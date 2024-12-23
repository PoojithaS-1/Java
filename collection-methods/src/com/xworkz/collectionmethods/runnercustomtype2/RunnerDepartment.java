package com.xworkz.collectionmethods.runnercustomtype2;

import java.util.ArrayList;
import java.util.Collection;

public class RunnerDepartment {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add(new Department("HR", "D001"));
        collection1.add(new Department("Marketing", "D002"));
        collection1.add(new Department("Finance", "D003"));
        collection1.add(new Department("IT", "D004"));
        collection1.add(new Department("Sales", "D005"));

        Collection collection2 = new ArrayList();
        collection2.add(new Department("Research and Development", "D006"));
        collection2.add(new Department("Quality Assurance", "D007"));
        collection2.add(new Department("Customer Support", "D008"));
        collection2.add(new Department("Training and Development", "D009"));
        collection2.add(new Department("Operations", "D010"));

        boolean isAdded = collection1.addAll(collection2);
        System.out.println("Data added successfully!! " + isAdded);

        boolean areEqual = collection1.equals(collection2);
        System.out.println(areEqual);

        int size = collection1.size();
        System.out.println("Array size is: " + size);

        boolean contains = collection1.contains(new Department("HR", "D001"));
        System.out.println(contains);

        boolean containsAll = collection1.containsAll(collection2);
        System.out.println(containsAll);

        // collection1.clear();
        // collection1.remove(new Department("HR", "D001"));
        // collection1.removeAll(collection2);

        System.out.println(collection1);
    }
}
