package com.xworkz.calciapp.ironbox;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IronBox implements Comparable<IronBox> {
    private int id;
    private String type;
    private String brand;
    private String model;
    private double price;
    private boolean isSteamFunction;

    @Override
    public int compareTo(IronBox o) {
        return this.getId() - o.getId();
    }
}
