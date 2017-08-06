package com.programowanie1.euclides;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Euclides {

    private static int euclides(int x, int y){
        while(x != y){
            if (x > y){
                x -= y;
            } else {
                y -= x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj x");
        int x = sc.nextInt();
        System.out.println("Podaj y");
        int y = sc.nextInt();
        int nwd = euclides(x,y);
        System.out.println(nwd);

    }
}
