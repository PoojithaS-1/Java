package com.xworkz.calciapp.ironbox.comparator;

import com.xworkz.calciapp.ironbox.IronBox;

import java.util.Comparator;

public class IronboxIdComparator implements Comparator<IronBox> {
    @Override
    public int compare(IronBox o1, IronBox o2) {
        return o1.getId()-o2.getId();
    }
}
