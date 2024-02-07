package classlectures.cat;

import java.util.Stack;

public class LeadersInArray {
    public static void main(String[] args) {
            int[] arr = {16, 17, 4, 3, 5, 2};
            leaderArray(arr);
    }

    private static void leaderArray(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = arr.length;
        stack.push(arr[n-1]);

        for (int j = n - 2; j >= 0; j--) {
            if (stack.peek() < arr[j]) {
                stack.push(arr[j]);
            }
        }
        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
