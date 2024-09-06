package array;

public class ReverseArray {

    //using two pointer method
    //reverse array using for loop
    public static void reverseArray(int[] arr) {
        int temp;
        for(int i=0; i<arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //reverse array using while loop
    public static void reverseArrayWhileLoop(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void display(int[] arr){
        for(int a : arr)
            System.out.print(a+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};

        System.out.println("Array: ");
        display(nums);

        System.out.println("Reverse Array:");
        reverseArray(nums);
        display(nums);

        System.out.println("Again Reverse Array:");
        reverseArrayWhileLoop(nums);
        display(nums);
    }

}
