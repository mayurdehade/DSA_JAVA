public class BubbleSortOptimized {

    //for best case it will take time complexity of O(n)
    
    public static void bubbleSortOptimized(int[] arr) {
        for(int turn=0; turn<arr.length-1; turn++) {
            int swap=0;
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            //if no swapping happend in array, array is sorted
            if(swap == 0) return;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,6};

        bubbleSortOptimized(arr);

        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}