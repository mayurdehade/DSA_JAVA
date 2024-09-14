package strings;

public class StringDemo {
    public static void main(String[] args) {

        //these two string have same reference
        //they are created by using literal
        //only single object is created in string constat pool
        String s1 = "Hello";
        String s2 = "Hello";

        //these two string have different reference
        //they are created by using new keyword
        //multiple objects are created in heap memory
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println((s1 == s2) +", "+ s1.equals(s2)); //true true
        System.out.println((s1 == s3) +", "+ s1.equals(s3)); //false true
        System.out.println((s3 == s4) +", "+ s3.equals(s4)); //false true

        //join two string
        String s5 = s1.concat("World");
        System.out.println(s5);

        //length of string
        System.out.println(s5.length());

        //substring (first value is inclusive, second value is exclusive)
        System.out.println(s5.substring(0));  //return full string
        System.out.println(s5.substring(0, 5));  //Hello
        System.out.println(s5.substring(1, 4));  //ell

        //replace (new string is created no actual string is changed)
        System.out.println(s5.replace("Hello", "Hi")); //here new string is created (string are immutable)
        System.out.println(s5);

        //here we concat string and store in the s5 which is actually having the string
        //we concat s5 with "Java" and storing in s5 then new string is created and s5 reference is changed with new string
        //so previous h5 string is not changed, and it is in memory
        s5 = s5.concat("Java");
        System.out.println(s5);

        //chatAt
        System.out.println(s5.charAt(0)); //give first character
        System.out.println(s5.charAt(s5.length()-1)); //give last character

        //lastIndexOf: give last index of character
        System.out.println(s5.lastIndexOf("a"));

        //trim: trim all spaces from start and end
        System.out.println(s5.trim());

        //startsWith
        System.out.println(s5.startsWith("Hello"));
        System.out.println(s5.startsWith("hello"));

        //split: split string into array
        String [] stringArr = s5.split("");
        for(String s: stringArr) {
            System.out.print(s+" ");
        }

        System.out.println();

        //isEmpty
        String str = new String();
        String str2 = " ";
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());




    }
}
