package strings;

public class SubStrings {

    public static void main(String[] args) {
        String str = "code";

        substrings(str);
    }

    private static void substrings(String str) {

        for(int i=0; i<=str.length(); i++) {
            for(int j=i+1; j<=str.length(); j++) {
                System.out.print(str.substring(i, j)+" ");
            }
        }
    }
}

