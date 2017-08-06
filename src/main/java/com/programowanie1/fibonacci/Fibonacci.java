package com.programowanie1.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    private static int fibonacci(int x){
        if (x <= 2){
            return 1;
        } else {
            return fibonacci(x - 2) + fibonacci(x -1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = sc.nextInt();
        System.out.println(fibonacci(x));
    }
}
