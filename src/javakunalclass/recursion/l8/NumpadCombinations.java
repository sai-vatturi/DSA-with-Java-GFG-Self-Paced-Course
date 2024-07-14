package javakunalclass.recursion.l8;

import java.util.*;


class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        List<String> res = combinations("", digits, map);
        return res;
    }

    public List<String> combinations(String p, String up, HashMap<Integer, String> map) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = (int) up.charAt(0) - '0';
        String nums = map.get(digit);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length(); i++) {
            res.addAll(combinations(p + nums.charAt(i), up.substring(1), map));
        }
        return res;
    }
}

public class NumpadCombinations {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.letterCombinations("23"));
    }
}