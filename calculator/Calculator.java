package com.xworkz.calciapp.calculator;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calculator implements Comparable<Calculator> {
    private String brand;
    private boolean isSolarPowered;
    private String calculatorType;
    private String powerSource;
    private int screenSize;


    @Override
    public int compareTo(Calculator o) {
        return this.getScreenSize()-o.getScreenSize();
    }
}