package pattern;

import java.util.Scanner;

public class DiamondPattern {

    public static void diamondPattern(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=(i*2-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=(i*2-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        diamondPattern(sc.nextInt());
    }
}
