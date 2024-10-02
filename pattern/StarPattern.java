package pattern;

import java.util.Scanner;

//Program to print star pattern
public class StarPattern {

    //function to print star pattern
    public static void printStar(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //user input
        System.out.println("Enter number: ");
        printStar(sc.nextInt());
    }
}
