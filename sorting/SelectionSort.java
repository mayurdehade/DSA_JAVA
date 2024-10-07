public class SelectionSort {

    //selection sort
    public static void selectionSort(int[] arr) {
        //outer for loop
        for(int i=0; i<arr.length-1; i++){
            int minPos = i; //assume small element at i th position
            //inner for loop
            for(int j=i+1; j<arr.length; j++) {
                //if any element is less than minPost then we change minPost
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        } 
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        selectionSort(arr);

        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}