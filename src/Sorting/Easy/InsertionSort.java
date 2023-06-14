package Sorting.Easy;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] expected = {2, 3, 4, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3, 4};

        insertionSort(input);
        System.out.println(Arrays.toString(input));

    }

    public InsertionSort() {}

    public static int [] insertionSortA(int[] array) {
        if(array.length == 0){
            return new int[] {};
        }

        return array;
    }

    // Insertion sort as learned in college
    public static void insertionSort(int[] array) {
        int swap = 0;
        int compare = 0;
        int unsortedValue;  // The first unsorted value
        int scan;           // Used to scan the array
        for (int index = 1; index < array.length; index++) {
            // System.out.println(index+"....... start\n");
            unsortedValue = array[index];
            scan = index;
            // System.out.println("Value = "+array[index]);
            while (scan > 0 && array[scan - 1] > unsortedValue) {
                compare++;
                array[scan] = array[scan - 1];
                scan--;
                // System.out.println("Scan Value = " + scan);
            }
            swap++;
            array[scan] = unsortedValue;
        }
        System.out.println("number of comparisons " + compare);
        System.out.println("number of swaps       " + swap);
    }
}
