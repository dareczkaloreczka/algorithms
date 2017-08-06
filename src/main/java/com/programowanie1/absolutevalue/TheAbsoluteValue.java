package com.programowanie1.absolutevalue;

import java.util.Scanner;

public class TheAbsoluteValue {

    private static int absoluteValue (int x){
        if (x >=0){
            return  x;
        } else {
            return x *= -1;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = scanner.nextInt();

        System.out.println(absoluteValue(x));




    }
}
