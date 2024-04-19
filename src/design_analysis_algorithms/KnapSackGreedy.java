package design_analysis_algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class KnapSackGreedy {
    static class Item implements Comparable<Item> {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        @Override
        public int compareTo(Item other) {
            double ratio1 = (double) this.value / this.weight;
            double ratio2 = (double) other.value / other.weight;
            if (ratio1 > ratio2) {
                return -1;
            } else if (ratio2 > ratio1) {
                return 1;
            }
            else {
                return other.value - this.value;
            }
        }
    }

    static void knapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(values[i], weights[i]);
        }
        Arrays.sort(items);

        int totalValue = 0;
        int currentWeight = 0;

        boolean[] selected = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i].weight <= capacity) {
                currentWeight += items[i].weight;
                totalValue += items[i].value;
                selected[i] = true;
            }
        }

        System.out.println("Selected items:");
        for (int i = 0; i < n; i++) {
            if (selected[i]) {
                System.out.println("Value: " + items[i].value + "\t Weight: " + items[i].weight);
            }
        }
        System.out.println("Total Value: " + totalValue);
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        knapsack(values, weights, capacity);
    }
}
