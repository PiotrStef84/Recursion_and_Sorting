package Sorting.Easy;

import java.util.Arrays;

public class BubbleSort {

    /* Write a function that takes in an array of integers and returns a sorted version of that array. Use the
    * Bubble Sort algorithm to sort the array*/

    public static void main(String[] args) {

        int[] expected = {2, 3, 5, 5, 6, 8, 9};
        int[] input = {8, 5, 2, 9, 5, 6, 3};

        bubbleSort(input);

        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(input));
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
