package array;

import org.w3c.dom.ls.LSOutput;

public class LearnArray {
    public static void main(String[] args) {
        //creating new array
        int[] arr = new int[5];

        System.out.println(arr); //[I@15aeb7ab (It give the address)
        //[ -> address for array
        //I -> I for Integer
        //@15aeb7ab -> address of very first location of array

        System.out.println(arr.length); //give size of array

        //get element
        System.out.println(arr[0]); //0 default value
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //set element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //get element
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //Iterating elements of array
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Printing element reverse
        System.out.println("Reverse array element");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }

        //Enhanced for loop (only forward, read only)
        System.out.println("Enhanced For Loop");
        for(int val: arr)
            System.out.println(val);

        //creating new array
        //only address of one array assign to another original array remains same
        //but if we change the value of arr2 then it refers to original address
        //then value from arr is also changed
        int[] arr2 = arr; //assigning address of arr to arr2 not creating new array

        //changing element of arr2
        arr2[1] = 100;
        System.out.println(arr[1]); //100


        //Passing arrays as reference
        int i=0, j=2;
        System.out.println("-------- CASE 1 --------");
        System.out.println(arr[i] + ", "+ arr[j]);
        swap(arr[i], arr[j]);//passing only value of array not array
        System.out.println(arr[i] + ", "+ arr[j]);


        System.out.println("-------- CASE 2 --------");
        System.out.println(arr[i] + ", "+ arr[j]);
        //when we array passed to method then the address is passed to method
        //and the change in array is happened with through the reference of array
        //then original array value is changed
        swap(arr, i ,j);//passing only value of array not array
        System.out.println(arr[i] + ", "+ arr[j]);


        System.out.println("-------- CASE 3 --------");
        int[] other = {100,200,300};
        //it will not change anything because in method we are creating a reference variable
        //and after method block is ended then it also removed from memory
        //we don't change the arr and other pointer reference
        //we only change the reference of one, two and temp
        System.out.println(arr[0] + ", " + arr[1]);
        swap(arr, other);
        System.out.println(arr[0] + ", " + arr[1]);
    }

    public static void swap(int a, int b) {
       int temp = a;
       a = b;
       b = temp;
    }

    //passing array as reference then it will change the original array
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //it will no change anything
    public static void swap(int[] one, int[] two) {
        int[] temp = one;
        one = two;
        two = temp;
    }
}
