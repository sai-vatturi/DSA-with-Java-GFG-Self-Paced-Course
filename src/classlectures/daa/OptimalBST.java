package classlectures.daa;

import java.util.Scanner;

public class OptimalBST {
    static int optCost(int freq[], int i, int j){ // 19 lines
        if (j < i) // Cyclomatic complexity - Edges - nodes + 2
            return 0;
        if (j == i)
            return freq[i];
        int fsum = sum(freq, i, j);
        int min = Integer.MAX_VALUE;
        for(int r = i; r <= j; ++r){
            int cost = optCost(freq, i, r-1) +
                    optCost(freq, r+1, j);
            if(cost < min)
                min = cost;
        }
        return min + fsum;
    }
    static int optimalSearchTree(int keys[], int freq[], int n){
        return optCost(freq, 0, n-1);
    }
    static int sum(int freq[], int i, int j){
        int s = 0;
        for (int k = i; k <=j; k++){
            s += freq[k];
        }
        return s;
    }
    public static void main(String[] sai){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of keys: ");
        int n = s.nextInt();
        int keys[] = new int[n];
        int freq[] = new int[n];
        System.out.println("Enter the keys:");
        for(int i=0; i<n; i++){
            keys[i] = s.nextInt();
        }
        System.out.println("Enter the Frequencies:");
        for(int i=0; i<n; i++){
            freq[i] = s.nextInt();
        }
        System.out.println("Cost of Optimal BST is " +optimalSearchTree(keys, freq, n));
    }
}