package pat_training;

import java.util.HashSet;

public class FindSmallestCharacter {
    public static void main(String[] args) {
        String s = "aidubudxd";
        System.out.println(smallestCharacter(s));
        System.out.println(smallestCharacter("bbbb"));
    }

    public static char smallestCharacter(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
//        for (char i = 'a'; i <= 'z'; i++) {
//            for (int j = 0; j < s.length(); j++
//        }
        return '0';
    }
}
