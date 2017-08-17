package com.programowanie1.sortByInsertion;

public class InsertionSort {

    private static void insertionSort (int[] unsorted){
        int index;
        int checked;

        for (int i = 0; i <unsorted.length ; i++) {
            index = i;
            checked = unsorted[i];
            while (index > 0 && unsorted[index -1] > checked){
                unsorted[index] = unsorted[index-1];
                index--;
            }
            unsorted[index] = checked;
        }
        for(int sorted : unsorted){
            System.out.println(sorted);
        }
    }

    public static void main(String[] args) {

        int [] unsorted = {66, 89, 2, 4, 67, 33, 11};
        insertionSort(unsorted);
    }

}
