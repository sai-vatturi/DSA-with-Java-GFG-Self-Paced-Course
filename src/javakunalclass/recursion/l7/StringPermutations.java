package javakunalclass.recursion.l7;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(printStringPermutations("", str));
    }

    private static int printStringPermutations(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count += printStringPermutations(f + ch + s, up.substring(1));
        }
        return count;
    }
}
