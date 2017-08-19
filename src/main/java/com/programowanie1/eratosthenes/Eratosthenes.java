package com.programowanie1.eratosthenes;

public class Eratosthenes {

    public static int [] eratosthenes (int [] scope){

        int sqrt = (int) Math.floor(Math.sqrt(scope.length-1));
        for (int i = 0; i <scope.length - 1 ; i++) {
            for (int j = i+1; j < scope.length - 1; j++) {
                if (scope[i] !=0 && scope[j] != 0 && scope[j] % scope[i] == 0){
                    scope[j] = 0;
                }
            }
            if (scope[i] > sqrt){
                break;
            }

        }
        return scope;
    }

    public static void main(String[] args) {

        int [] scope = new int[30];
        for (int i = 0; i <scope.length-1 ; i++) {
            scope[i] = i+2;
            System.out.println(i);
        }

        int[] first = eratosthenes(scope);
        for (int x : first){
            System.out.println(x);
        }
        }

}
