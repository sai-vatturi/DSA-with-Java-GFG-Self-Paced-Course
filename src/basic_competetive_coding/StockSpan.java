package basic_competetive_coding;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 5, 90, 120, 80 };
        stockSpan(arr);

    }
    static void stockSpan(int[] arr) {
        int  n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        st.push(0);
        res[0] = 1;
        for (int j = 1; j < n; j++) {
            while (!st.isEmpty() && arr[j] > arr[st.peek()]) {
                st.pop();
            }
            res[j] = st.isEmpty() ? j + 1 : j - st.peek();
            st.push(j);
        }

        System.out.println(Arrays.toString(res));
    }
}
