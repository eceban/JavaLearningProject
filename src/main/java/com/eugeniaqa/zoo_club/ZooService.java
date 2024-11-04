package com.eugeniaqa.zoo_club;

public class ZooService {

    public static void main(String[] args) {
        Animal cat001 = new Cat("Jesica", 5);
        Dog dog1 = new Dog("Rex", 12);
        Lion lion001 = new Lion("Simba", 25);

        System.out.println(lion001.getAge());
        lion001.makeSound();
        cat001.makeSound();
        System.out.println(cat001.getName());
    }
}
