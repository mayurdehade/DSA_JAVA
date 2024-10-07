public class InsertionSort {

    //Insertion Sort
    public static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        insertionSort(arr);

        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}