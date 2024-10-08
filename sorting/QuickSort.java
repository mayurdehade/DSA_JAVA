public class QuickSort {

    public static void quickSort(int[] arr, int si, int ei) {
        //base condition
        if(si>=ei) return;

        int idx = partition(arr, si, ei);
        quickSort(arr, si, idx-1);
        quickSort(arr, idx+1, ei);
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,10,4,1,2,3,0};
        quickSort(arr, 0, 7);
        for(int a: arr) {
            System.out.print(a+" ");
        }
    }
}