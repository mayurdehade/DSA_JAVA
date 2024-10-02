package recursion;

public class LengthOfString {

    public static int length(String str) {
        //base case is string is empty then length is 0
        if(str.isEmpty()) return 0;

        //remove first character and give other string to iterate
        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(length("hello"));
    }
}
