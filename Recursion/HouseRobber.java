package Recursion;

//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
//stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security
//systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

//Given an integer array nums representing the amount of money of each house, return the maximum amount of money
//you can rob tonight without alerting the police.

public class HouseRobber {

    public static int houseRobber(int[] arr, int idx) {
        //base condition
        if(idx >= arr.length) return 0; //no house present

        //choice
        //choose house
        int fnm1 = arr[idx] + houseRobber(arr, idx+2); //is you choose current house then you can't rob next adjacent house

        //leave house
        int fnm2 = houseRobber(arr,idx+1);

        return Math.max(fnm1, fnm2);

//        return Math.max(arr[idx] + houseRobber(arr, idx+2), houseRobber(arr,idx+1));
    }

    public static void main(String[] args) {
        int[] arr = {3,1,1,9};

        System.out.println(houseRobber(arr, 0));
    }
}
