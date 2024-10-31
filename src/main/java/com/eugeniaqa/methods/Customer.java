package com.eugeniaqa.methods;

public class Customer {

    private String name;
    private String email;
    private int age;

    public Customer(String name, String email, int age){
        this.name = name;
        this.email = email;
        setAge(age);
    }

    public Customer() {

    }


    public void setName (String enteredName){
        name = enteredName;
    }

    public String getName () {
        return this.name;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getEmail () {
        return this.email;
    }

    public void setAge ( int age){
        if (age < 18 || age > 100) {
            this.age = 0;
            System.out.println("The entered age is not valid");
        } else {
            this.age = age;
        }
    }

    public int getAge () {
        return this.age;
    }

    public String getTheObjectInformation () {
        return "The name of the customer is [" + this.name + "] with email [" + this.email +
                "] and age [" + age + "]";
    }

}
