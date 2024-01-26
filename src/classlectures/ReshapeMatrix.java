package classlectures;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        int[][] mat = matrixReshape(arr, 1, 4);
        for (int i= 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
        public static int[][] matrixReshape(int[][] mat, int r, int c) {
            int n = mat.length;
            int m = mat[0].length;
            if(r*c != n*m) {
                return mat;
            }
            int[] arr = new int[r*c];
            int[][] ans = new int[r][c];
            int index = 0;
            for(int i = 0;i<mat.length;i++){
                for(int j = 0;j<mat[i].length;j++){
                    arr[index++] = mat[i][j];

                }
            }
            int nm = 0;
            for(int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j] = arr[nm++];

                }
            }
            return ans;
        }
}
