public class CountingSort {

    //counting sort
    public static void countingSort(int[] arr) {
        //finding largest element
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        //counting frequency
        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++) {
            while(count[i]>0){
                //perform on original array
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,2,1,8,4,5,3,3,4,5,6,7,6};

        countingSort(arr);
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}