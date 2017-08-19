package com.programowanie1.idCreator;

public class IdCreator {

    public static void createID (String iD) {
        int sum = 0;
        int[] values = new int[iD.length()];
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <alphabet.length ; j++) {
                if (iD.charAt(i) == alphabet[j]){
                    int charValue = j + 10;
                    switch (i){
                        case 0:
                           sum += charValue*7;
                            break;
                        case 1:
                           sum += charValue*3;
                            break;
                        case 2:
                           sum += charValue;
                            break;
                    }
                }
            }
        }
        for (int i = 4; i <9 ; i++) {
            for (int j = 0; j <10 ; j++) {
                if (Integer.parseInt(String.valueOf(iD.charAt(i))) == j){
                    int charValue = j;
                    switch (i){
                        case 4:
                        case 7:
                            sum += charValue*7;
                            break;
                        case 5:
                        case 8:
                            sum += charValue*3;
                            break;
                        case 6:
                            sum += charValue;
                            break;
                    }
                }


            }

        }
        System.out.println(sum);
        if(sum%10 == Integer.parseInt(String.valueOf(iD.charAt(3)))){
            System.out.println("o ja jebie udało sie");
        }
        else{
            System.out.println("breaaak timeee");
        }

    }

    public static void main(String[] args) {

        createID("ABS123456");
    }
}
