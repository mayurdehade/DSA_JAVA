package recursion;

//Print x^n

public class Power1 {

    public static int pow(int x, int n) {
        //base condition
        if(n == 0) return 1;

        return x * pow(x, n-1);
    }

    public static void main(String[] args) {

        System.out.println("Power of 2^10: " + pow(2, 10));
    }
}
