package pattern;

import java.util.Scanner;

//program to print butterfly pattern
public class ButterflyPattern {

    public static void butterflyPatter(int n) {
        for(int i=1; i<=n; i++) {
            //star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=i*2; j<n*2; j++) {
                System.out.print("  ");
            }
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //mirror image
        for(int i=n; i>=1; i--) {
            //star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=i*2; j<n*2; j++) {
                System.out.print("  ");
            }
            //star
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        butterflyPatter(sc.nextInt());
    }
}
