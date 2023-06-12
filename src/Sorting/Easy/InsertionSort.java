package Sorting.Easy;

public class InsertionSort {

    public InsertionSort() {}

    // Insertion sort as learned in college
    public void insertionSort(int[] array) {
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
