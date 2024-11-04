package com.eugeniaqa.classes_and_objects;

public class Car {
    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String make;
    String model;

    public Car(String modelOfTheCar, String makeOfTheCar, String colorOfTheCar) {
        this.color = colorOfTheCar;
        this.make = makeOfTheCar;
        this.model = modelOfTheCar;
    }

    public Car(String make, String model, String color, String plateNumber, int km) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.plateNumber = plateNumber;
        this.kmWhenEnteredTheService = km;
        System.out.println("The car object has been created with all the details");
    }
}
