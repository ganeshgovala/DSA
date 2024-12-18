package DSA;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5,8,3,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
