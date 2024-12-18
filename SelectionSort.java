import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 4, 5, 8, 3, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        int min = 0, temp = 0;
        for(int i = 0; i < arr.length; i++) {
            min = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
