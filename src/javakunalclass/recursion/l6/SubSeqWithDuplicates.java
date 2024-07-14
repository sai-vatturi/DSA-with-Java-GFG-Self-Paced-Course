package javakunalclass.recursion.l6;

import java.util.ArrayList;
import java.util.List;

public class SubSeqWithDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        subSeqWithDupliates(nums);
    }

    private static void subSeqWithDupliates(int[] nums) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if (i > 0 && nums[i - 1] == nums[i]) {
                start = end +  1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }

        for (List<Integer> list : outer) {
            System.out.println(list);
        }
    }
}
