package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1); // int -> Integer  --- AUTOBOXING
        numberList.add(3);
        numberList.add(5);


        int sum = 0;

        for (Integer number : numberList) {
            sum = sum + number;  // Integer -> int ----- UNBOXING
        }

        System.out.println("Sum of numbers: " + sum);  // sum of the value

    }
}