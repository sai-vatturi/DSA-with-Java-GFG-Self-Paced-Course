package classlectures.cat;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 8;
        int k = 3;
        System.out.println(josephus(n, k));
    }
    static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        }

        else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
}