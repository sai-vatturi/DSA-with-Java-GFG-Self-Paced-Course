package basic_competetive_coding;
import java.util.TreeSet;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String input = "ABCCD"; // Replace with your input string
        permutations("", sortString(input));
    }

    static void permutations(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }

        TreeSet<Character> usedChars = new TreeSet<>();
        for (int i = 0; i < u.length(); i++) {
            char ch = u.charAt(i);

            // Skip duplicate characters
            if (usedChars.contains(ch)) {
                continue;
            }

            usedChars.add(ch);
            String remaining = u.substring(0, i) + u.substring(i + 1);
            permutations(p + ch, remaining);
        }
    }

    static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
