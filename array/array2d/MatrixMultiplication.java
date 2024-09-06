package array.array2d;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {
                {1,2,3},
                {4,5,6}
        };

        int [][] m2 = {
                {1,1},
                {1,2},
                {2,1}
        };

        int ans[][] = matrixMultiplication(m1, m2);

        for(int[] an:ans) {
            for(int a:an) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplication(int[][] m1, int[][] m2) {
        int r1 = m1.length;
        int c1 = m1[0].length;
        int c2 = m2[0].length;
        //create new array with r1xc2
        int[][] ans = new int[r1][c2];

        for(int i=0; i<ans.length; i++) {
            for(int j=0; j<ans[0].length; j++) {
                int sum = 0;
                for(int k=0; k<c1; k++) {
                    int temp = m1[i][k] * m2[k][j];
                    sum+=temp;
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}
