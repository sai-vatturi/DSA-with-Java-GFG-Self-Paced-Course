package javakunalclass.recursion.l6;

import com.sun.jdi.ArrayReference;
import javakunalclass.oops.access.A;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceIterative {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        List<List<Integer>> res = subset(num);
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> subset(int[] num) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int i : num) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(i);
                outer.add(internal);
            }

        }

        return outer;
    }
}
