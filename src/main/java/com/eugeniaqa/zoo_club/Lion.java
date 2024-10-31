package com.eugeniaqa.zoo_club;

public class Lion extends Animal {

    public Lion(String nameOfTheLion, int age) {
        super(nameOfTheLion, age);
    }

    @Override
    public void eat() {
        System.out.println("Pure meat - neam neam");
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrr");
    }
}
