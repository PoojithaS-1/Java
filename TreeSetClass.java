package com.xworkz.collectionheirarchyclass;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        Collection collection4=new TreeSet();
        collection4.add("tiger");
        collection4.add("lion");
        collection4.add("cat");
        collection4.add("dog");
        collection4.add("bear");
        collection4.add("deer");
        collection4.add("elephant");
        System.out.println("TreeSet: "+collection4);//values are aligned in ascending order
    }
}
