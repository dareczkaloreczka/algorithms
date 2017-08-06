package com.programowanie1.arrayRandomElement;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandomElement {

    private static int[] randomElements(int draws, int [] numbers){
        Random random = new Random();
        int[] randomElements = new int[draws];
        int index = numbers.length - 1;
        while (draws < numbers.length && draws > 0){
            int randomIndex = random.nextInt(index);
            randomElements[draws - 1] = numbers[randomIndex];
            numbers[randomIndex] = numbers[index];
            index--;
            draws --;
        }
        return randomElements;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe elementów tablicy");
        int lenght = scanner.nextInt();
        System.out.println("Podaj liczbe losowan");
        int draws = scanner.nextInt();
        int [] numbers = new int[lenght];
        for (int i = 0; i< numbers.length; i++){
            System.out.println("Podaj kolejny element:");
            numbers[i] = scanner.nextInt();
        }
        int [] randomNumbers = randomElements(draws, numbers);
        for (int element : randomNumbers){
            System.out.println(element);
        }

    }
}
