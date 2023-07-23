package org.example;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Engineer("newBie");
        Worker worker2 = new ChiefEngineer("senior", 3);

        System.out.println(worker1);
        System.out.println(worker2);
    }
}