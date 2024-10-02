package recursion;
//Print all possible Binary strings without consecutive one's

public class PrintBinaryStrings {

    public static void printBinaryStrings(int n, int lastPlace, String str) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        //Kaam
        //sit 0 on chair
        printBinaryStrings(n-1, 0, str+"0");
        //if previous is one then we can't set next as one
        if(lastPlace == 0) {
            printBinaryStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {

        printBinaryStrings(3, 0, "");
    }
}
