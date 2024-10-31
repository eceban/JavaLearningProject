package com.eugeniaqa.zoo_club;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Bones with Meat - neam neam");
    }

    @Override
    public void makeSound() {
        System.out.println("Ham-ham");
    }
}
