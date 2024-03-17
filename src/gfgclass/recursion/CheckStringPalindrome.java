package gfgclass.recursion;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        String name = "HELLOOLLEHA";
        System.out.println(findPalindrome(name, 0, name.length() - 1));
    }

    static boolean findPalindrome(String name, int left, int right) {
        if (name.charAt(left) != name.charAt(right)) {
            return false;
        }
        if (left >= right) {
            return true;
        }
        return findPalindrome(name, left + 1, right - 1);
    }
}
