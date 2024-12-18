import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,2,5,1,6};
        long start_time = System.nanoTime();
        insertionSort(arr);
        long end_time = System.nanoTime();
        System.out.println("Total Time : "+(end_time - start_time));
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < arr[i]) {
                for(int j = i+1; j > 0; j--) {
                    if(arr[j] < arr[j-1]) {
                        temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
        }
    }
}
