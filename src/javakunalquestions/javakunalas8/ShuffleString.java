package javakunalquestions.javakunalas8;

public class ShuffleString {
    public static void main(String[] args) {

    }
    public String restoreString(String s, int[] indices) {
        String res = s;
        for (int i = 0; i < indices.length; i++) {
            int org = indices[i];
            char ch = s.charAt(org);
            res.replace((char) org, ch);
        }
        return res;
    }
}
