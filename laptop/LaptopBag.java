package com.xworkz.calciapp.laptop;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LaptopBag implements Comparable<LaptopBag>{
    private int size;
    private String color;
    private String material;
    private boolean isWaterproof;
    private int numberOfCompartments;


    @Override
    public int compareTo(LaptopBag o) {
        return this.getSize()-o.getSize();
    }
}

