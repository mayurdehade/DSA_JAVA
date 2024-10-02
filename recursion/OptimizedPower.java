package recursion;

public class OptimizedPower {

    public static int optimizedPower(int x, int n) {
        //base condition
        if(n == 0) return 1;

        int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);

        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {

        System.out.println("Power of 2^10 is: " + optimizedPower(2,10));
    }
}
