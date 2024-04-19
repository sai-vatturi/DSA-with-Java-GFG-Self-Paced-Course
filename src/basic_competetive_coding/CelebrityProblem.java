package basic_competetive_coding;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}
        };
        int ans = celebrityProblem(matrix);
        System.out.println(ans == -1 ? "No Celebrity" : ans);

    }
    static int celebrityProblem(int[][] matrix) {
        Stack<Integer> st = new Stack<>();
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int col = st.pop();
            int row = st.pop();
            if (matrix[row][col] == 1) {
                st.push(col);
            }
            else {
                st.push(row);
            }
        }
        int x = st.pop();
        for (int i = 0; i < n; i++) {
            if (i!=x && matrix[i][x] == 0) {
                return -1;
            }
            if (i!=x && matrix[x][i] == 1) {
                return -1;
            }
        }
        return x;
    }
}
