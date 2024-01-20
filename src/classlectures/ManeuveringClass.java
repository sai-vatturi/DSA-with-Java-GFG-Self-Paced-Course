package classlectures;

public class ManeuveringClass {
    static int numberOfPathsRecursive(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return numberOfPathsRecursive(m-1, n) + numberOfPathsRecursive(m, n-1);
    }
    static int getNumberOfPaths2D(int m, int n){
        int[][] count = new int[m][n];
        for (int i = 0; i < m; i++) {
            count[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            count[0][j] = 1;
        }
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                count[i][j] = count[i-1][j] + count[i][j-1];
            }
        }
        return count[m-1][n-1];
    }
    static int getNumberOfPaths1D(int m, int n) {
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                count[j] = count[j] +  count[j-1];
            }
        }
        return count[n-1];
    }
    public static void main(String[] args) {
        System.out.println("Total number of paths: "+getNumberOfPaths1D(3, 3));
//        System.out.println(numberOfPathsRecursive(3,3));
//        System.out.println(getNumberOfPaths2D(3, 3));
    }
}

