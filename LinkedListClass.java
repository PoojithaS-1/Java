package com.xworkz.collectionheirarchyclass;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        Collection collection7=new LinkedList();
        collection7.add("kannada");
        collection7.add("hindi");
        collection7.add("marati");
        collection7.add("urdu");
        collection7.add("tamil");
        collection7.add("telugu");
        collection7.add("malayalam");
        collection7.add("english");
        System.out.println("LinkedList: "+collection7);//same order as it is inserted
    }
}
