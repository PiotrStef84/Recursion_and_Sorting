package Sorting.Easy;

import java.sql.SQLOutput;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] expected = {2, 3, 4, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3, 4};

        System.out.println("-------- Collage ------------");
        insertionSort(input);
        System.out.println(Arrays.toString(input));

        int[] input2 = {8, 5, 2, 9, 5, 1, 56, 2, 6, 3, 4, 15};

        System.out.println("------------ Algo ------------");
        insertionSortA(input2);
        System.out.println(Arrays.toString(input2));


    }

    // Best: O(n) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space

    public static void insertionSortA(int[] array) {

        for(int i =0; i< array.length; i++){
            int j = i;
            while(j > 0 && array[j] < array[j - 1]){
                swap(j, j-1, array);
                j--;
            }
        }

    }

    public static void swap(int j, int i, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

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
