package array.array2d;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,0},
                {2,5,0,7},
                {8,2,5,3}
        };

        setMatrixZeroes(matrix);

        for(int[] mat: matrix) {
            for(int m: mat) {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }

    public static void setMatrixZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean isRow = false;
        boolean isCol = false;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                    if(i==0) isRow=true;
                    if(j==0) isCol=true;
                }
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(isRow) {
            for(int j=0; j<n; j++) {
                matrix[0][j]=0;
            }
        }

        if(isCol) {
            for(int i=0; i<m; i++) {
                matrix[i][0]=0;
            }
        }
    }
}
