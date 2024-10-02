package pattern;

import java.util.Scanner;

//program to print half pyramid pattern (numbers)
public class HalfPyramid {

    public static void halfPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        halfPyramid(sc.nextInt());
    }
}
