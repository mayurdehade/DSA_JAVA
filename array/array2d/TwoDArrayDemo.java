package array.array2d;

public class TwoDArrayDemo      {

    public static void main(String[] args) {
        int[][] a = new int[3][4]; //3 rows and 4 cols

        int[][] a1 = {
                {1,2,7},
                {3,4,8},
                {5,6,9}
        };

        System.out.println(a); //give the address
        // [[I@15aeb7ab -> [[ this represents 2D array I -> is for integer

        //give the address of first array
        System.out.println(a1[0]); //[I@7b23ec81
        System.out.println(a1[1]); //[I@6acbcfc0
        System.out.println(a1[2]); //[I@5f184fc6

        //printing how many rows
        System.out.println(a.length); //3 ros

        //printing how many columns (length of inside array)
        System.out.println(a[0].length); //4

        System.out.println(a[0][0]); //default value is 0

        System.out.println(a1[1][1]); //4

        //setting or updating value
        a[2][3] = 200;

        System.out.println(a[2][3]); //200

        //printing all elements of 2D array
        for(int i=0; i<a1.length; i++) { //row
            for(int j=0; j<a1[0].length; j++) { //col
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }

        //printing all elements using Enhanced for loop
        for(int[] val: a1){
            for(int temp: val){
                System.out.print(temp+" ");
            }
            System.out.println();
        }

        //Jagged Array
        System.out.println("Jagged Array");
        int[][] arr = new int[3][]; //rows is define, we can store any number of elements in each row

//        arr[0] = new int[4];
//        arr[1] = new int[3];
//        arr[2] = new int[2];

        arr[0] = new int[]{10,20,30};
        arr[1] = new int[]{40,50};
        arr[2] = new int[]{80};

        //jagged array
        int[][] arr2 = {
                {1},
                {2,3,4},
                {5,6},
                {7,8,9}
        };

        //printing rows and cols
        System.out.println(arr.length); //rows
        System.out.println(arr[0].length); //cols for first array
        System.out.println(arr[1].length); //cols for second array

        //printing all elements of array
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) { //mention each index of calculating length of array
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //Enhanced for work as it is
        for(int[] val: arr2){
            for(int temp: val){
                System.out.print(temp+" ");
            }
            System.out.println();
        }

    }
}
