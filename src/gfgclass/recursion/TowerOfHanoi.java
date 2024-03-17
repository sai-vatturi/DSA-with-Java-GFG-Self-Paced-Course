package gfgclass.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(63, 1, 2, 3);
    }
    static void toh(int n, int start, int aux, int end) {
        if (n > 0) {
            toh(n - 1, start, end, aux);
            System.out.println("Move disk " + start + " to " + end);
            toh(n - 1, aux, start, end);
        }
    }
}
