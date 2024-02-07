package classlectures.cat;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
    }
    static void permutations(String p, String u) {
        if (u.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = u.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, u.substring(1));
        }
    }
}
