package com.programowanie1.arrayElementCounter;

import java.util.Scanner;

public class ArrayElementCounter {

    private static int elementCounter (int element, int[] numbers){
        int counter = 0;
        for (int number : numbers){
            if (number == element){
                counter ++;
            }
        }
        return counter;
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
        System.out.println("Podaj liczbę której wystąpienia chcesz zliczyć:");
        int element = scanner.nextInt();

        System.out.println(elementCounter(element, numbers));
    }
}
