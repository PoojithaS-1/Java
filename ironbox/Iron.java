package com.xworkz.calciapp.ironbox;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Iron implements Comparable<Iron> {
    private int id;
    private String type;
    private String brand;
    private String model;
    private double price;
    private boolean isSteamFunction;

    @Override
    public int compareTo(Iron o) {
        return this.getId() - o.getId();
    }
}
