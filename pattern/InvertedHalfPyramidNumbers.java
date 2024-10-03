package pattern;

import java.util.Scanner;

//program to print inverted half pyramid with numbers
public class InvertedHalfPyramidNumbers {

    public static void invertedHalfPyramid(int n){
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        invertedHalfPyramid(sc.nextInt());
    }
}
