package javakunalclass.recursion.l8;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        String p = "";
        List<Integer> list = dice(p, 4);
        System.out.println(list);
    }

    private static List<Integer> dice(String p, int target) {
        if (target == 0) {
            List<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(p));
            return list;
        }
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= target && i <= 6; i ++) {
            res.addAll(dice(p + i, target - i));
        }

        return res;
    }
}
