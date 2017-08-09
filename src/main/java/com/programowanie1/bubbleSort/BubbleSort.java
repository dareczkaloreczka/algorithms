package com.programowanie1.bubbleSort;

import java.util.Scanner;

public class BubbleSort {

    private static void bubbleSort(int[] numbers) {
        boolean needChange = true;
        int temp = 0;
        while (needChange) {
            needChange = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    needChange = true;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros = {6, 5, 2, 8, 7};
        bubbleSort(numeros);
        for (int n : numeros) {
            System.out.println(n);
        }
  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementów tablicy");
        int lenght = scanner.nextInt();
        int[] numbers = new int[lenght];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj kolejny element:");
            numbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers = bubbleSort(numbers);
        for (int number : sortedNumbers) {
            System.out.println(number);
        }*/
    }
}
