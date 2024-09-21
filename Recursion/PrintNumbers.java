package Recursion;
//Print numbers from n to 1 (Decreasing order) using recursion
public class PrintNumbers {

    public static void printDec(int n) {
        //base case
        if(n == 1) {
            System.out.println(n);
            return;
        }

        //print the value of n
        System.out.println(n);

        //call itself with n-1
        printDec(n-1);

    }

    public static void main(String[] args) {
        int n = 10;

        //call the function
        printDec(n);
    }
}


