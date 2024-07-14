package javakunalclass.recursion.l6;

public class SkipString {
    public static void main(String[] args) {
        String str = "fadkfhaappleadf";
        System.out.println(skipApple(str));
        String str2 = "fadkfhaappadf";
        System.out.println(skipAppNotApple(str));
        System.out.println(skipAppNotApple(str2));

    }

    private static String skipApple(String str) {
        if (str.isEmpty()) return "";
        if (str.startsWith("apple")) return skipApple(str.substring(5));
        else return str.charAt(0) + skipApple(str.substring(1));
    }

    private static String skipAppNotApple(String str) {
        if (str.isEmpty()) return "";
        if (str.startsWith("app") && !str.startsWith("apple")) return skipAppNotApple(str.substring(3));
        else return str.charAt(0) + skipAppNotApple(str.substring(1));
    }
}
