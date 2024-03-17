package gfgclass.recursion;

public class PowerSetSubSet {
    public static void main(String[] args) {
        String s = "ABC";
        printPowerSet(s.toCharArray(), s.length());
        subSets("ABC", "", 0);
    }
    static void printPowerSet(char []set, int set_size) {
        int pow_set_size =  (int)Math.pow(2, set_size);

        for (int counter = 0; counter < pow_set_size; counter++) {
            for (int j = 0; j < set_size; j++) {
                if((counter & (1 << j)) != 0) {
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }
    }

    static void subSets(String s, String curr, int index) {
        if (index == s.length()) {
            System.out.println(curr);
            return;
        }
        subSets(s, curr, index + 1);
        subSets(s, curr + s.charAt(index), index + 1);
    }
}
