package com.programowanie1.arraySum;

import java.util.Scanner;

public class ArraySum {

    private static int sum (int [] numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementów tablicy");
        int lenght = scanner.nextInt();
        int [] numbers = new int[lenght];
        for (int i = 0; i< numbers.length; i++){
            System.out.println("Podaj kolejny element:");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(sum(numbers));
    }
}
