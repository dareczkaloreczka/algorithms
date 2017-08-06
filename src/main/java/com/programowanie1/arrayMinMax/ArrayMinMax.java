package com.programowanie1.arrayMinMax;

import java.util.Scanner;

public class ArrayMinMax {

    private static int getMin(int[] numbers){
        int min = numbers[0];
        for (int number : numbers){
            if (number < min){
                min = number;
            }
        }
        return min;
    }
    private static int getMax(int[] numbers){
        int max = numbers[0];
        for (int number : numbers){
            if (number > max){
                max = number;
            }
        }
        return max;
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
        System.out.println(getMax(numbers));
        System.out.println(getMin(numbers));
    }
}
