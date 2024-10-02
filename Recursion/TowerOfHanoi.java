package Recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String des) {
        //base condition
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + des);
            return;
        }

        //calling for n-1 disk transfer from src to helper to transfer bottom disk to des
        towerOfHanoi(n-1, src, des, helper);
        //src -> src, des -> helper, helper -> des
        System.out.println("Transfer disk " + n + " from " + src + " to " + helper);

        //calling for n-1 disk transfer from helper to des
        towerOfHanoi(n-1, helper, src, des);
    }

    public static void main(String[] args) {
        int n = 3;

        towerOfHanoi(n, "S", "H", "D");
    }
}
