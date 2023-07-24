package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1); // int -> Integer  --- AUTOBOXING
        numberList.add(3);
        numberList.add(5);

        Integer b = new Integer(4);
        System.out.println(b);

        String string = new String("a");
        String string1 = new String("abckadir");

        for (char c : string1.toCharArray()){
            System.out.println(c);
        }


        int sum = 0;

        for (Integer number : numberList) {
            sum = sum + number;  // Integer -> int ----- UNBOXING
        }

        System.out.println("Sum of numbers: " + sum);  // sum of the value

    }
}