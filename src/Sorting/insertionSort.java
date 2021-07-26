package Sorting;

public class insertionSort {

    // // [1 , 3 ,9 ,9 , 10 ,2 ]
    public void insertionSort(int arr[]){
        for(int i=1; i<arr.length;i++){
            int current= arr[i];
            int j=i;
            while (j>0 &&  current < arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=current;
        }
    }
}
