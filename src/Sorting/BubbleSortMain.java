package Sorting;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] arr = {9,8,12,1,4,6,3};
        BubbleSort s = new BubbleSort();
        s.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
