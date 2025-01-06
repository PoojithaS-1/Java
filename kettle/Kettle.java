package com.xworkz.calciapp.kettle;

import com.xworkz.calciapp.ironbox.Iron;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Kettle implements Comparable<Kettle> {
    private int id;
    private String brand;
    private String color;
    private float capacity;
    private String material;
    private int voltage;


    @Override
    public int compareTo(Kettle o) {
        return this.getId()-o.getId();
    }
}