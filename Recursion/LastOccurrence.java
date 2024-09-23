package Recursion;
//Write a function to find the last occurrence of element in array

public class LastOccurrence {

    //first approach
    public static int lastOcc(int[] arr, int key, int idx) {
        //base condition
        if(idx==-1) return -1; //element not found

        if(arr[idx] == key) return idx; //element found

        return lastOcc(arr, key, idx-1); //recursive call
    }

    //second approach
    public static int lastOcc2(int[] arr, int key, int idx){
        //base case
        if(idx == arr.length)
            return -1;

        int isFound = lastOcc2(arr, key, idx+1); //traversing full array starting from first to last
        if(isFound == -1 && arr[idx] == key)
            return idx;

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,6,7,4,5,6,8,2,9,7,6,3};

//        System.out.println("Last Occurrence of element: "+ lastOcc(arr, 2, arr.length-1));

        System.out.println("Last Occurrence of element: "+ lastOcc2(arr, 10, 0));
    }
}
