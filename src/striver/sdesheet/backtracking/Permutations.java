package striver.sdesheet.backtracking;
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        printPermutations(nums);
    }

    public static void printPermutations(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        getPermutations(nums, res, ds, freq);

        // Print the Resultant Array
        for (List<Integer> list : res) {
            System.out.println(list);
        }
    }

    public static void getPermutations(int[] nums,  List<List<Integer>> res, List<Integer> ds, boolean[] freq) {
        if (ds.size() == nums.length) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                getPermutations(nums, res, ds, freq);
                ds.removeLast();
                freq[i] = false;
            }
        }
    }
}