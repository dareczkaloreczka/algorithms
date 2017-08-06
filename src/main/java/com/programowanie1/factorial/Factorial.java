package com.programowanie1.factorial;

import java.util.Scanner;

public class Factorial {

    private static int calculateFactorial (int x){
        if (x <=1){
            return x;
        } else {
            return x*calculateFactorial(x-1);
        }
    }

    private static int factorial (int x){
        if (x <= 1){
            return x;
        } else {
            int result = 1;
            for (int i = 2; i <= x; i++){
                result *= i;
            }
            return result;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = scanner.nextInt();
        System.out.println(calculateFactorial(x));
    }
}
