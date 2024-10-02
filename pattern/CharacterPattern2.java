package pattern;

import java.util.Scanner;

//program to print character pattern
public class CharacterPattern2 {

    public static void printCharacter(int n) {
        char c = 'A';
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print(c + " ");
                c += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        printCharacter(sc.nextInt());
    }
}
