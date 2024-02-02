package javakunalas8;

import java.util.ArrayList;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "sentence4 a3 is2 This1";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] name = s.split(" ");
        String[] res = new String[name.length];
        for (int i = 0; i < name.length; i++) {
            int last = name[i].length() - 1;
            int digit = name[i].charAt(last) - '0';
            res[digit -1] = name[i].substring(0, last);

        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < res.length; j++) {
            sb.append(res[j]).append(" ");
        }
        return  (sb.toString().trim());
    }
}
