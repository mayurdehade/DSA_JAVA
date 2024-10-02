package pattern;

import java.util.Scanner;

//program to print square pattern
public class SquarePattern {

    //function to print square pattern
    public static void printSquare(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //user input
        System.out.println("Enter number: ");
        printSquare(sc.nextInt());
    }
}
