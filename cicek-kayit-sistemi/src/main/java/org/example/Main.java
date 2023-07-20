package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Scanner scanner = new Scanner(System.in);
        Flower Lily = new Builder()
                .name("Lily")
                .color("Pink")
                .amount(100)
                .price(30)
                .build();

    }

    Flower rose =new Builder()
            .name("Rose")
            .amount(40)
            .price(60)
            .build();
}