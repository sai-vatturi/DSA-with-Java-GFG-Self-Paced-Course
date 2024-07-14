package javakunalclass.recursion.l8;

import java.util.HashMap;

class Solution2 {
    public int letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        int count = combinations("", digits, map);
        return count;
    }

    public int combinations(String p, String up, HashMap<Integer, String> map) {
        if (up.isEmpty()) {
            return 1;
        }
        int digit = (int) up.charAt(0) - '0';
        String nums = map.get(digit);
        int count = 0;
        for (int i = 0; i < nums.length(); i++) {
            count += combinations(p + nums.charAt(i), up.substring(1), map);
        }
        return count;
    }
}
public class NumpadCombinationsCount {
    public static void main(String[] args) {
        Solution2 obj = new Solution2();
        System.out.println(obj.letterCombinations("37"));
    }
}
