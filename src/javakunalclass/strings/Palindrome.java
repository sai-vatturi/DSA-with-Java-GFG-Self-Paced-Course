package javakunalclass.strings;

public class Palindrome {
    public static void main(String[] args) {
        String name = "abba";
        System.out.println(isPalindrome(name));
    }
    public static boolean isPalindrome(String a) {
        if (a == null) {
            return true;
        }
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }

}
