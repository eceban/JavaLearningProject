package com.eugeniaqa.accessmodifiers;

import com.eugeniaqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {

    public static void main(String[] args) {

        Person.isHuman = true;

        Person person1 = new Person("Pavel", "Sarghi", 546245);
        System.out.println(person1.name + " " + person1.getSurname() + " - ID: " + person1.ID);
        person1.setAge(61);
        System.out.printf("Age: %d  \n", person1.getAge());
        person1.printRetirementStatus();

        Person person2 = new Person("Antonina", "Galet", 4545454, 25, 'f', "MD");
        System.out.printf("\n%s %s - age: %d \n", person2.name, person2.getSurname(), person2.getAge());
        person2.printRetirementStatus();

        Person person3 = new Person("Valentin", "Bordea", 546465);
        person3.setAge(60);
        person3.setSex('m');
        person3.setResidence("RO");
        System.out.printf("\n%s %s - id: %d\nIs human: %s\nSex: %c\nResidence: %s\nAge: %d\n",
                            person3.name, person3.getSurname(), person3.ID,
                            Person.isHuman, person3.getSex(), person3.getResidence(), person3.getAge());
        person3.printRetirementStatus();


    }
}
