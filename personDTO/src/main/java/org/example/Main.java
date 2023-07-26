package org.example;


public class Main {
    public static void main(String[] args) {

        PersonDTO person = new PersonDTO("Sevda OLGUN", 21,"12 Main St");

        Database.savePerson(person);
    }
}