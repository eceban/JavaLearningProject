package com.eugeniaqa.classes_and_objects;

public class Tool {
    String name;
    double price;
    double weight;

    public Tool(String nameOfTool, double weight) {
        this.name = nameOfTool;
        this.weight = weight;
        System.out.println("The tool has been created");
    }

    public Tool(String name, double price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}
