package recursion;

public class NumberIntoString {

    static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void numberIntoString(int number) {
        //base condition
        if(number == 0) return;

        //kaam
        int lastDigit = number%10;

        numberIntoString(number/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String[] args) {
        int number = 12840483;
        numberIntoString(number);
    }
}
