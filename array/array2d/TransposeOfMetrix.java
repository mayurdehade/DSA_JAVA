package array.array2d;

public class TransposeOfMetrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8}
        };

        int[][] ans = transpose(arr);

        for(int[] an : ans) {
            for(int a: an) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] ans = new int[c][r];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                ans[j][i] = arr[i][j];
            }
        }

        return ans;
    }
}
