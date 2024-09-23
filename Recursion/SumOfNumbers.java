package Recursion;

public class SumOfNumbers {

    public static int sum(int n) {
        //base condition
        if(n == 1) return 1;

        return n + sum(n-1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Sum is " + sum(5));
    }
}
