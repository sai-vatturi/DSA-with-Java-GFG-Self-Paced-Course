package gfgclass.recursion;

public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(ropeCutting(10, 2, 6, 4));

    }
    static int ropeCutting(int num, int a, int b, int c) {
        if (num == 0)  {
            return 0;
        }
        if (num < 0) {
            return -1;
        }
        int x = ropeCutting(num - a, a, b, c);
        int y = ropeCutting(num - b, a, b, c);
        int z = ropeCutting(num - c, a, b, c);

        int res = Math.max(x, Math.max(y, z));

        if (res == -1) {
            return -1;
        }
        return res + 1;
    }
}
