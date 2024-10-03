package pattern;

import java.util.Scanner;

public class PalindromicPattern {

    public static void palindromicPattern(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            //numbers reverse
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            //numbers
            for(int j=2; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        palindromicPattern(sc.nextInt());
    }
}
