package Recursion;

//Given n friends, each one can remain single or can be paired with some other friend.
//Each friend can be paired only once. Find out the total number of ways in which
//friends can remain single or can be paired up.
//Goldman Sachs
public class FriendsPairingProblem {

    public static int pairFriends(int n) {
        //base case
        if(n == 1 || n == 2) return n;

//        //choice
//        //single
//        int fnm1 = pairFriends(n-1);
//
//        //pair
//        int fnm2 = (n-1) * pairFriends(n-2);
//
//        //total ways
//        int totlWays = fnm1 + fnm2;
//
//        return totlWays;

        return pairFriends(n-1) + (n-1) * pairFriends(n-2);
    }

    public static void main(String[] args) {
        System.out.println(pairFriends(3));
    }
}
