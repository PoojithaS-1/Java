package com.xworkz.collectionheirarchyclass;

import java.util.Collection;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        Collection collection6=new LinkedHashSet();
        collection6.add(111);
        collection6.add(22);
        collection6.add(33);
        collection6.add(444);
        collection6.add(777);
        collection6.add(666);
        collection6.add(999);
        System.out.println("LinkedHashSet: "+collection6);//same order as it is inserted

    }
}
