package array.arraylist;

import java.util.ArrayList;

public class AddTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {5, 6, 7};
        int[] nums2 = {3, 4, 4, 6};

        System.out.println(addTwoArray(nums1, nums2));
    }

    public static ArrayList<Integer> addTwoArray(int[] nums1, int[] nums2){
        int i = nums1.length-1, j = nums2.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0, sum = 0;
        while(i>=0 || j>=0) {
            sum = carry;
            if (i>=0){
                sum += nums1[i];
            }

            if(j>=0) {
                sum += nums2[j];
            }

            int rem = sum%10;
            ans.add(0, rem);
            carry = sum/10;

            i--;
            j--;

        }

        if(carry != 0) ans.add(0, carry);

        return ans;
    }
}
