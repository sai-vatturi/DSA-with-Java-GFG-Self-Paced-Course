package basic_competetive_coding;

import java.util.Stack;

public class StackPermutations {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {3, 1, 2};
        System.out.println(stackPermutation(a, b));

    }
    static boolean stackPermutation(int[] a, int[] b) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int i = 0; i <  a.length; i++) {
            st.push(a[i]);
            while(!st.isEmpty() && st.peek() == b[j]) {
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}
