package org.example;

public class Database {

    public static void savePerson(PersonDTO person) {
        System.out.println("Saving person to the database");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Person saved successfully!");
    }
}
