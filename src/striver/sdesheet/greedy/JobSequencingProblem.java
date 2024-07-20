package striver.sdesheet.greedy;

import java.util.Arrays;
import java.util.Comparator;

class Job {
    public int id, profit, deadline;
    public Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }

    @Override
    public String toString() {
        return this.id + " " + this.deadline + " " + this.profit;
    }
}

public class JobSequencingProblem {
    public static void main(String[] args) {
        Job[] arr = new Job[4];
        arr[0] = new Job(1, 4 , 20);
        arr[1] = new Job(2, 1, 10);
        arr[2] = new Job(3, 1 , 40);
        arr[3] = new Job(4, 1, 30);

        System.out.println(Arrays.toString(JobScheduling(arr, 4)));
    }

    public static int[] JobScheduling(Job[] arr, int n) {
        // Sort jobs in reverse order of profit
        Arrays.sort(arr, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit - o1.profit;
            }
        });
        System.out.println(Arrays.toString(arr));

        int[] jobs = new int[n + 1];

        Arrays.fill(jobs, -1);
        int maxProfit = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int deadline = arr[i].deadline;
            int profit = arr[i].profit;
            int id = arr[i].id;

            if (jobs[deadline] == - 1) {
                jobs[deadline] = profit;
                maxProfit += profit;
                count += 1;
            }
            else {
                int j = deadline - 1;
                while (jobs[j] != -1) {
                    j = j - 1;
                }
                if (j != 0) {
                    jobs[j] = profit;
                    maxProfit += profit;
                    count += 1;
                }
            }
        }

        return new int[]{count, maxProfit};
    }
}
