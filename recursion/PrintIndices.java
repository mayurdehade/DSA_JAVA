package recursion;

public class PrintIndices {

    public static void printIndices(int[] arr, int n, int key) {
        //base condition
        if(n == arr.length) return; //no element is there

        //kaam
        if(key == arr[n]){
            System.out.println(n);
        }

        printIndices(arr, n+1, key);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};

        printIndices(arr, 0, 2);
    }
}
