package recursion;

public class PrintIncresing {

    public static void printIncr(int n) {
        if(n == 0) return;

        printIncr(n-1);

        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;

        printIncr(n);
    }
}
