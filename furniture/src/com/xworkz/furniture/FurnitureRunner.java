package com.xworkz.furniture;

import com.xworkz.furniture.table.Table;

public class FurnitureRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        Table table = new Table();
        table.getFurnitureDetails("Dining Table", "Wooden");
        System.out.println("Main ended");
    }
}
