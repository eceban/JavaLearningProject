package com.eugeniaqa.accessmodifiers.peopleevidence;

public class Person {

    public static boolean isHuman;
    public String name;
    protected String surname;
    public final long ID;
    private int age;
    private char sex;
    protected String residence;
    public boolean isRetired;

    public Person(String firstName, String lastName, long id) {
        name = firstName;
        surname = lastName;
        ID = id;
    }

    public Person(String name, String surname, long ID, int age, char sex, String residence) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.setAge(age);
    }

    public void printRetirementStatus() {
        if (isRetired) {
            System.out.println(name + " este la pensie");
        } else {
            System.out.println(name + " nu este la pensie");
        }
    }

    public void setAge(int enteredAge) {
        if (enteredAge > 0 && enteredAge < 100) {
            this.age = enteredAge;
            if (age > 60) {
                isRetired = true;
            }
        } else {
            System.out.println("The entered age is not valid, the property age is still empty");
        }
    }

    public int getAge() {
        return this.age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
