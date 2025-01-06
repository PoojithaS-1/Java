package com.xworkz.calciapp.helmet;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Helmet implements Comparable<Helmet> {
    private int id ;
    private String color;
    private String brand;
    private String vehicleServiceType;
    private int itemWeight;
    private String material;

   @Override
    public int compareTo(Helmet o) {
        return this.getId() - o.getId();
    }
}
