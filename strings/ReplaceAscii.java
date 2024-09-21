package strings;

public class ReplaceAscii {

    public static void main(String[] args) {

        String str = "cdEfG";

        String ans = replaceAscii(str);

        System.out.println(ans);
    }

    private static String replaceAscii(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<n; i++) {
            if(i%2==0) {
                //even case
                sb.setCharAt(i, (char) (sb.charAt(i)+1));
            } else {
                //odd case
                sb.setCharAt(i, (char) (sb.charAt(i)-1));
            }
        }
        return sb.toString();
    }
}
