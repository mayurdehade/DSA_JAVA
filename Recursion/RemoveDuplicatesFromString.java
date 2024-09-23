package Recursion;

public class RemoveDuplicatesFromString {

    public static String removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        //base condition
        if(idx == str.length()) return "";

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            newStr.append(currChar);
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr, map);
        }

        return newStr.toString();

    }

    public static void main(String[] args) {
        String str = "appnnacollege";

        System.out.println(removeDuplicates(str, 0, new StringBuilder(), new boolean[26]));
    }
}
