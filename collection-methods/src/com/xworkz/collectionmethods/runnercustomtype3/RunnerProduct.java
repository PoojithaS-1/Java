package com.xworkz.collectionmethods.runnercustomtype3;

import java.util.ArrayList;
import java.util.Collection;

public class RunnerProduct {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add(new Product("Laptop", "P001", 50000.0));
        collection1.add(new Product("Mobile", "P002", 20000.0));
        collection1.add(new Product("TV", "P003", 30000.0));
        collection1.add(new Product("Refrigerator", "P004", 40000.0));
        collection1.add(new Product("AC", "P005", 60000.0));

        Collection collection2 = new ArrayList();
        collection2.add(new Product("Washing Machine", "P006", 25000.0));
        collection2.add(new Product("Microwave Oven", "P007", 15000.0));
        collection2.add(new Product("Dishwasher", "P008", 20000.0));
        collection2.add(new Product("Vacuum Cleaner", "P009", 10000.0));
        collection2.add(new Product("Air Purifier", "P010", 12000.0));

        boolean isAdded = collection1.addAll(collection2);
        System.out.println("Data added successfully!! " + isAdded);

        boolean areEqual = collection1.equals(collection2);
        System.out.println(areEqual);

        int size = collection1.size();
        System.out.println("Array size is: " + size);

        boolean contains = collection1.contains(new Product("Laptop", "P001", 50000.0));
        System.out.println(contains);

        boolean containsAll = collection1.containsAll(collection2);
        System.out.println(containsAll);

        boolean retainAll=collection1.retainAll(collection2);
        System.out.println(retainAll);

        // collection1.clear();
        // collection1.remove(new Product("Laptop", "P001", 50000.0));
        // collection1.removeAll(collection2);

        System.out.println(collection1);
    }
}
