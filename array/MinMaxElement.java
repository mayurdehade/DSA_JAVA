package array;

public class MinMaxElement {

    public static void main(String[] args) {
        int[] nums = {10,50,40,1,30,4,750,102,99};

        minElement(nums); //1

        maxElement(nums); //750
    }

    public static void minElement(int[] arr) {
        int min = arr[0];
//        int min = Integer.MAX_VALUE;
        for(int a:arr) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Minimum Element: "+min);
    }

    public static void maxElement(int[] arr) {
        int max = arr[0];
//        int max = Integer.MIN_VALUE;
        for(int a:arr) {
            if(a>max) {
                max = a;
            }
        }
        System.out.println("Maximum Element: "+max);
    }

}
