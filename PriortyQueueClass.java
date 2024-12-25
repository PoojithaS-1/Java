package com.xworkz.collectionheirarchyclass;

import java.util.Collection;
import java.util.PriorityQueue;

public class PriortyQueueClass {
    public static void main(String[] args) {
        Collection collection3=new PriorityQueue();
        collection3.add("pooja");
        collection3.add("keerthi");
        collection3.add("varsha");
        collection3.add("kavana");
        collection3.add("bhoomi");
        collection3.add("pallavi");
        collection3.add("chaitra");
        System.out.println("PriorityQueue: "+collection3);//random alignment of values
    }
}
