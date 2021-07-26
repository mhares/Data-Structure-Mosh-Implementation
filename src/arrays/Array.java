package arrays;

public class Array {
    private int[] arr;
    private int count;
    public Array(int size){
        arr= new int[size];
    }

    public void insert(int value){
        if(count >= arr.length-1){
            int[] tempArr = new int[arr.length*2];
            for (int i=0; i< arr.length;i++){
                tempArr[i]=arr[i];
            }
            arr=tempArr;
        }
        arr[count++]=value;
    }
 // 10 20 30 40 50
    public void removeAt(int index ){
        if(index<0 || index > count ){
            throw new IllegalArgumentException();
        }

        for (int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        --count;
    }

    public int indexOf(int value){
        for (int i = 0; i <count ; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}
