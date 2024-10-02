package pattern;

import java.util.Scanner;

//program to print inverted star pattern
public class InvertedStar {

    public static void invertedStar(int n) {
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        invertedStar(n);
    }
}
