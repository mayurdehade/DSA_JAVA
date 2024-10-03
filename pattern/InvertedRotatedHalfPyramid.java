package pattern;

import java.util.Scanner;
//program to print inverted and rotated half pyramid
public class InvertedRotatedHalfPyramid {

    public static void invertedRotatedHalfPyramid(int n) {
        for(int i=1; i<=n; i++) { //rows
            //blank space
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            //print *
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        invertedRotatedHalfPyramid(sc.nextInt());
    }
}
