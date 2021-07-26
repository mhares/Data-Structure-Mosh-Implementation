package linkedlists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        int arr[] = list.toArray();
        System.out.println(Arrays.toString(arr));


    }
}
