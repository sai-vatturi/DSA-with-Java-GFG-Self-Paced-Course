package javakunalclass.recursion.l8;

import java.util.ArrayList;
import java.util.List;

public class DiceCustomN {
    public static void main(String[] args) {
        String p = "";
        int count = diceCustomN(1, 6, p, 4);
        System.out.println(count);
    }

    private static int diceCustomN(int n, int k, String p, int target) {
        if (target == 0) {
            return 1;
        }
       int count = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= target && i <= k; i ++) {
                count += diceCustomN(n, k, p + i, target - i);
            }
        }

        return count;
    }
}

