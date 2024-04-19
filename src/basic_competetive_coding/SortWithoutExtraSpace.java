package basic_competetive_coding;

import java.util.LinkedList;
import java.util.Queue;

public class SortWithoutExtraSpace {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(1);
        q.add(6);
        q.add(5);
        sortWithoutExtraSpace(q);
        System.out.println(q);

    }

    static void sortWithoutExtraSpace(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            int minElement = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < n; j++) {
                int curr = q.remove();
                if (curr < minElement && j < (n - i)) {
                    minElement = curr;
                    minIndex = j;
                }
                q.offer(curr);
            }
            for (int j = 0; j < n; j++) {
                int element = q.poll();
                if (j != minIndex) {
                    q.add(element);
                }
            }
            q.add(minElement);
        }
    }
}