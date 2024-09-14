package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {

        //Creating String
        String str = "abc";

        //String Builder
        StringBuilder sb = new StringBuilder(); //empty string
        sb.append("hello");

        System.out.println(sb);

        sb.append("Mayur"); //concat

        System.out.println(sb);

        sb.insert(0, "Hey "); //insert a string at that location

        System.out.println(sb);

        sb.setCharAt(2, 'e'); //replace a specific character of string

        System.out.println(sb);

        //converting StringBuilder to String
        String newStr = sb.toString();

        System.out.println(newStr);
    }
}
