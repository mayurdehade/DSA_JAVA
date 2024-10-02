package pattern;

import java.util.Scanner;

//program to print character pattern
public class CharacterPattern {

    public static void characterPattern(int n) {
        char c = 'A';
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print((char)(c+j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        characterPattern(sc.nextInt());
    }
}
