package Recursion;

//Find the first occurrence of element in array

public class FirstOccurrence {

    public static int firstOcc(int[] arr, int key, int idx) {
        //base case
        if(idx == arr.length ) return -1; //element not found

        if(arr[idx] == key) return idx; //element found and returning index

        return firstOcc(arr, key, idx+1); //calling itself
    }

    public static void main(String[] args) {
        //declaring array
        int[] arr = {1,2,4,3,5,6,8,5,4,3};

        System.out.println("Element found at index: "+firstOcc(arr, 5, 0));
    }
}
