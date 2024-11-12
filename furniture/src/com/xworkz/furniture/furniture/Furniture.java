package com.xworkz.furniture.furniture;

public class Furniture {
        public Furniture() {
            System.out.println("Furniture constructor is invoked");
        }
        public void getFurnitureDetails(String type, String material) {
            System.out.println("Type: " + type);
            System.out.println("Material: " + material);
        }
}
