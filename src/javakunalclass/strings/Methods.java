package javakunalclass.strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sai Nadh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('i'));
        System.out.println("     Sai    Nadh ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
