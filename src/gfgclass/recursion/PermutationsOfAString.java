package gfgclass.recursion;


public class PermutationsOfAString {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, 0);
    }

    static void permute(String s, int currentIndex) {
        if (currentIndex == s.length()) {
            System.out.println(s);
            return;
        }
        for (int j = currentIndex; j < s.length(); j++) {
            s = swap(s, currentIndex, j);
            permute(s, currentIndex + 1);
            s = swap(s, currentIndex, j);

        }
    }
    static String swap(String str, int a, int b) {
        StringBuilder sb = new StringBuilder(str);
        char temp = str.charAt(a);
        sb.setCharAt(a, str.charAt(b));
        sb.setCharAt(b, temp);
        return  sb.toString();
    }
}
