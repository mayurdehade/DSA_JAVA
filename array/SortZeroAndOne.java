package array;

public class SortZeroAndOne {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        sortZeroAndOne(arr);

        for(int a : arr) {
            System.out.print(a);
        }
    }

    private static void sortZeroAndOne(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while (low < high) {
            if(arr[low] == 1 && arr[high] == 0) {
                arr[low] = 0;
                arr[high] = 1;
                low++;
                high--;
            } else if(arr[low] == 0) {
                low++;
            } else {
                high--;
            }
        }


    }
}
