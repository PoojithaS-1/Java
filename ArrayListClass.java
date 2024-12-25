package com.xworkz.collectionheirarchyclass;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListClass {
    public static void main(String[] args) {
        Collection collection1 =new ArrayList();
        collection1.add(111);
        collection1.add(222);
        collection1.add(113);
        collection1.add(114);
        collection1.add(115);
        collection1.add(11);
        collection1.add(19);
        collection1.add(151);
        System.out.println("ArrayList: "+ collection1);//same order as it is inserted
    }
}
