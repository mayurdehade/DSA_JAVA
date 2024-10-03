package pattern;

import java.util.Scanner;

//program to print solid rhombus
public class SolidRhombus {

    public static void solidRhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            //stars
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            //newline
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        solidRhombus(sc.nextInt());
    }
}
