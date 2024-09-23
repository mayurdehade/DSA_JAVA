package Recursion;
//Find the array is sorted in increasing order or not
public class SortedArray {

    public static boolean isSorted(int[] arr, int i) {
        //base condition
        if(i == arr.length -1) return true;

        if(arr[i]>arr[i+1]) return false;

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.println("Array is sorted: "+isSorted(arr, 0));
    }
}
