package Sorting;

public class SelectionSort {
// [10 , 3 ,9,1 , 5 ,2 ]
    public void SelectionSort(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
           int minimum = i ;
            for (int j = 1; j <arr.length ; j++) {
                if(arr[j] < arr[minimum]) {
                    minimum=j;
                }
            }
            swap(arr,i , minimum);
        }
    }


    private void swap(int arr[] , int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
