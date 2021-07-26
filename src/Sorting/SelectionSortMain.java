package Sorting;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();
        int[] arr = {9,8,12,1,4,6,3};
        s.SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
