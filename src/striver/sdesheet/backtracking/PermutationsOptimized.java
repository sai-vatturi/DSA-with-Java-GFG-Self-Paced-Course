package striver.sdesheet.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOptimized {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        printPermutations(nums);
    }

    public static void printPermutations(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getPermutations2(nums, res, 0);

        // Print the Resultant Array
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }
    public static void getPermutations2(int[] nums, List<List<Integer>> res, int index) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i : nums) list.add(i);
            res.add(list);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            getPermutations2(nums, res, index + 1);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
