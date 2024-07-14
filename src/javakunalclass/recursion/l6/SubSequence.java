package javakunalclass.recursion.l6;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.TreeSet;

public class SubSequence {
    public static void main(String[] args) {
        ArrayList<String> res = printSubSets("", "abc");
        System.out.println(res);
    }

    private static ArrayList<String> printSubSets(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        char ch = up.charAt(0);
        ArrayList<String> include = printSubSets(p + ch, up.substring(1));
        ArrayList<String> exlucde = printSubSets(p, up.substring(1));
        include.addAll(exlucde);
        return include;
    }
}
