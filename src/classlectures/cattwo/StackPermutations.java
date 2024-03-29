package classlectures.cattwo;

import java.util.Stack;

public class StackPermutations {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] target = {3, 1, 2};
        System.out.println(stackPermutations(original, target));

    }
    static boolean stackPermutations(int[] original, int[] target) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        for (int element : original) {
            stack.push(element);
            while (!stack.isEmpty() && stack.peek() == target[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
