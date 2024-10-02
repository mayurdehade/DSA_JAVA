package pattern;

import java.util.Scanner;

//program to print the hollow rectangle
public class HollowRectangle {

    public static void printHollowRectangle(int row, int col) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(j==0 || j==col-1 || i==0 || i==row-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        printHollowRectangle(sc.nextInt(), sc.nextInt());
    }
}
