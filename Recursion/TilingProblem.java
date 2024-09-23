package Recursion;
//You have given a 2*n board and tile of 2*1
//you have to find the ways to tile the given board using the 2*1 tiles
//You can arrange the tiles vertically or horizontally
//Asked in Amazon

public class TilingProblem {

    public static int tilingProblem(int n) {
        //base condition
        if(n == 0 || n == 1) return 1;

//        //self work (kaam)
//        //vertical choice
//        int verticalTiles = tilingProblem(n-1);
//
//        //horizontal choice
//        int horizontalTiles = tilingProblem(n-2);
//
//        int totWays = verticalTiles + horizontalTiles;
//
//        return totWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Ways to tile board: " + tilingProblem(n));
    }
}
