package com.xworkz.calciapp.customtype.laptop;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class LaptopBag {
    private int size;
    private String color;
    private String material;
    private boolean isWaterproof;
    private int numberOfCompartments;


    public LaptopBag(int size, String color, String material, boolean isWaterproof, int numberOfCompartments) {
        this.size = size;
        this.color = color;
        this.material = material;
        this.isWaterproof = isWaterproof;
        this.numberOfCompartments = numberOfCompartments;
    }

    @Override
    public String toString() {
        return "LaptopBag{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", isWaterproof=" + isWaterproof +
                ", numberOfCompartments=" + numberOfCompartments +
                '}';
    }
}

