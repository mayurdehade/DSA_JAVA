package pattern;

import java.util.Scanner;

//Program to print 0-1 triangle pattern
public class ZeroOneTriangle {

    public static void zeroOneTriangle(int n) {
        int num = 1;
        for(int i=0; i<n; i++) {
            //if row is even then start with 1 else start with 0
            if(i%2==0) num = 1;
            else num = 0;

            for(int j=0; j<=i; j++) {
                System.out.print(num + " ");
                if(num == 1) num = 0;
                else num = 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        zeroOneTriangle(sc.nextInt());
    }
}
