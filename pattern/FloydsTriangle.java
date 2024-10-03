package pattern;

import java.util.Scanner;

//program to print Floyds's Triangle
public class FloydsTriangle {

    public static void floydsTriangle(int n) {
        int count = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        floydsTriangle(sc.nextInt());
    }
}
