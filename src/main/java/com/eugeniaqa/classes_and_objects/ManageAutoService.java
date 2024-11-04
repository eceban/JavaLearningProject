package com.eugeniaqa.classes_and_objects;

public class ManageAutoService {

    public static void main(String[] args) {

        Car car1 = new Car("Q5", "Audi", "Black", "AA452201", 22000);
        Car car2 = new Car("508", "Peugeot", "Gray");
        Car car3 = new Car("BMW", "X5", "White", "BOS 02", 45458);

        System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.plateNumber + " " + car1.kmWhenEnteredTheService);
        System.out.println(car2.make + " " + car2.model + " " + car2.color + " " + car2.plateNumber);

        Tool tool1 = new Tool("Hammer", 2);
        System.out.println("The name of the tool is " + tool1.name + " and its weight is  " + tool1.weight);

        Garage garage1 = new Garage();
        System.out.println(garage1.name + " on address: " + garage1.address);

        garage1.name = "Auto-Detailing";
        System.out.println(garage1.name + " on address: " + garage1.address);

        garage1.address = " Stefan cel Mare 146";
        System.out.println(garage1.name + " on address: " + garage1.address);

        Worker worker1 = new Worker();
        System.out.println(worker1.name);

        worker1.name = "George";
        worker1.salary = 5000;
        worker1.age = 18;
        worker1.height = 170;
        System.out.println("Worker: " + worker1.name + ", " + worker1.age + ", " + worker1.salary);
        System.out.println("Worker height: " + worker1.height);
    }
}
