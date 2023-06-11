package Sorting.Easy;

import java.util.Arrays;

public class BubbleSort {

    /* Write a function that takes in an array of integers and returns a sorted version of that array. Use the
    * Bubble Sort algorithm to sort the array*/

    public static void main(String[] args) {

        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};

        // second input to check second algorithm
        int[] input2 = {8, 5, 2, 9, 5, 6, 3};

        bubbleSortA(input2);
        bubbleSort(input);
        System.out.println("------------- College Solution ---------------");
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(input));

        System.out.println("------------- Algo Solution ---------------");
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(input2));
    }


    // Best: O(n) time | O(1) space ... best case when we receive already sorted array
    // Average: 0(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space
    private static void bubbleSortA(int[] array) {
        boolean swap = false;
        int sortedCounter = 0;

        // deducting a sorted counter, as after each iteration we are certain that last element
        // is sorted.

        while(!swap){
            swap = true;
            for(int i = 0; i< array.length - 1 - sortedCounter; i++){
                if(array[i] > array[i +1]){
                    swap(i, i+1, array);
                    swap = false;
                }
            }
            sortedCounter++;
        }

    }

    public static void swap(int i, int j, int[] array ){
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    // Bubble sort algorithm as learned in college
    private static void bubbleSort(int[] array) {
        int last;
        int index;
        int temp;
        int swap = 0;
        int compare = 0;

        for(last=array.length-1; last >=0; last--)
        {
            for(index=0;index<last;index++)
            {
                compare++;
                if(array[index]>array[index+1])
                {
                    swap++;
                    temp           = array[index];
                    array[index]   = array[index+1];
                    array[index+1] = temp;
                }
            }
        }

        System.out.println("number of comparisons "+compare);
        System.out.println("number of swaps       "+swap);

    }


}
