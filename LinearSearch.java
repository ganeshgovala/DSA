public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,1,9,2,8,3,7,4,6,5};
        int res = linearSearch(arr, 5);
        if(res == -1) System.out.println("Key value not found");
        else System.out.println("Key found at "+res+" position");
    }

    public static int linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i+1;
            }
        }
        return -1;
    }
}
