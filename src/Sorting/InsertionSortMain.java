package Sorting;

import java.util.Arrays;

public class InsertionSortMain {
    public static void main(String[] args) {
        insertionSort s = new insertionSort();

        int[] arr = {9,8,12,1,4,6};
        s.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
