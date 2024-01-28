package javakunalclass.strings;

public class Main {
    public static void main(String[] args) {
        String a = "Sai";
        String b = "Sai";
        System.out.println(a==b);
        String name1 = new String("Sai");
        String name2 = new String("Sai");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
