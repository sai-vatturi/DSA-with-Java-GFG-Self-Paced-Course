package javakunalclass.recursion.l6;

public class SkipACharacter {
    public static void main(String[] args) {
        String str = "baccad";
        String res = skipAChar(str, 0, 'a');
        System.out.println(res);
        skip1("", str);
        System.out.println(skip2(str));
    }

    // By passing answer string as argument
    private static String skipACharacter(String str, String res, int i, char ch) {
        if (i == str.length()) return res;
        if (str.charAt(i) != ch) return skipACharacter(str, res+str.charAt(i),  i + 1, ch);
        else return skipACharacter(str, res, i + 1, ch);
    }

    // by creating a variable in function body itself
    private static String skipAChar(String str, int i, char ch) {
        String res = "";
        if (i == str.length()) return res;
        if (str.charAt(i) != ch) return str.charAt(i) + skipAChar(str, i + 1, ch);
        else return skipAChar(str, i + 1, ch);
    }

    // by using substring method, passing answer  in argument
    private static void skip1(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') skip1(p, up.substring(1));
        else skip1(p + ch, up.substring(1));
    }

    // by using substring method, without passing answer in argument
    private static String skip2(String up) {
        if (up.isEmpty()) return "";
        if (up.charAt(0) == 'a') return skip2(up.substring(1));
        else return up.charAt(0) + skip2(up.substring(1));
    }
}
