package strings;

public class Palindrome {
    public static void main(String[] args) {

        String s = "madam";

        String s1 = "mayur";

//        System.out.println("Palindrome: "+ isPalindrome(s1));

        String str = "Hello! I am a string* with @non-alpha&numeric characters.";

        String str2 = "A #man, a plan, a$ canal: Panama...";

        //converting string into lowercase
        String newStr = str2.toLowerCase();

        //removing alphanumeric characters
        String input = newStr.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Palindrome: "+isPalindrome(input));


    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
