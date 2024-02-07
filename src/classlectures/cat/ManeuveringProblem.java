package classlectures.cat;

public class ManeuveringProblem {
    public static void main(String[] args) {
        System.out.print(numberOfPaths(3, 3));
    }
    static int numberOfPaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return numberOfPaths(m-1, n) + numberOfPaths(m, n - 1);
    }
}
