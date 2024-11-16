//Program to demonstrate Binary Search

public class BinarySearch {

    //method to search element using binary search
    public static boolean binarySearch(int[] arr, int elem) {
        //take starting and ending position
        int si = 0;
        int ei = arr.length-1;

        while(si<=ei) {
            //calculate mid
            int mid = si + (ei-si)/2;

            if(arr[mid] == elem) return true; //element found

            if(arr[mid] < elem) { //if mid element is less than our search element 
                si = mid+1;       //then change starting point as mid+1
            } else {
                ei = mid-1;     //if mid element is greater than our search element
                                //then change ending point as mid-1
            }
        }
        return false; //element not found
    }


    //main method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9,22,32,36,54,98}; //must be in sorted order
        
        System.out.println("Search for 7: " + binarySearch(arr, 7));
        System.out.println("Search for 54: " + binarySearch(arr, 54));
        System.out.println("Search for 5: " + binarySearch(arr, 5));

    }
}