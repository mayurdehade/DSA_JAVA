//Program for Linear Search
//Time Complexity: O(n)

public class LinearSearch {

    public static boolean linearSearch(int[] arr, int element) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {13,0,8,15,1,6,2,7,21,3,4,9,5};

        System.out.println("Element 7 found in Array: " + linearSearch(arr, 7));

        System.out.println("Element 55 found in Array: " + linearSearch(arr, 55));
    }
}