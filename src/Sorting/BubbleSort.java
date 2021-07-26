package Sorting;

public class BubbleSort {
    // [4 , 2 , 5  , 8]
    public void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) swap(arr,i,j);
            }
        }
    }

    public void swap(int arr[] , int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
