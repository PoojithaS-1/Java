package com.xworkz.collectionheirarchyclass;

import java.util.Collection;
import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        Collection collection2=new HashSet();
        collection2.add(34);
        collection2.add(30);
        collection2.add(13);
        collection2.add(19);
        collection2.add(346);
        collection2.add(342);
        collection2.add(4);
        collection2.add(3);
        System.out.println("HashSet: "+collection2);//random  alignment of values

    }
}
