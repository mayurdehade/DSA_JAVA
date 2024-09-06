package array.arraylist;

import java.util.ArrayList;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] one = {10,19,20,30,40,40,40,50};
        int[] two = {15,16,17,20,25,30,30,40};

//        System.out.println(intersection(one, two));

        for(int n: intersection2(one, two)){
            System.out.println(n);
        }
    }

    //Approach First (More time complexity)
    private static ArrayList<Integer> intersection(int[] one, int[] two) {
        //creating ans array.arraylist
        ArrayList<Integer> ans = new ArrayList<>();

        //two pointer
        int i = 0, j = 0;

        while(i<one.length && j<two.length) {
            //if the first array element is greater than second
            //then move second element pointer to next
            if(one[i] > two[j]){
                j++;
            }
            //if the second array element is greater than first
            //then move first element pointer to next
            else if(one[i]<two[j]){
                i++;
            }
            //if element matches then add to ans list and move both pointer to next
            else {
                ans.add(one[i]);
                i++;
                j++;
            }
        }

        return ans;
    }


    //Approach Second (less time complexity)
    public static int[] intersection2(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int a : nums1) {
            if(search(a, nums2)){
                if(!search(a, ans)) {
                    ans.add(a);
                }
            }
        }

        int[] ansarr = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            ansarr[i] = ans.get(i);
        }
        return ansarr;
    }


    public static boolean search(int ele, int[] arr){
        for(int a: arr) {
            if(ele == a) {
                return true;
            }
        }
        //if not present
        return false;
    }

    public static boolean search(int ele, ArrayList<Integer> arr) {
        for(Integer a: arr) {
            if(ele == a) {
                return true;
            }
        }
        return false;
    }
}
