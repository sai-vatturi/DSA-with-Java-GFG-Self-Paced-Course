package classlectures.daa;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Item {
    int weight;
    int value;
    double ratio;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (double) value / weight;
    }
    public double getRatio() {
        return ratio;
    }
}

public class Knapsack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        Item[] items = new Item[n];
        System.out.println("Enter the weight and value of each item:");

        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " - Weight: ");
            int weight = scanner.nextInt();
            System.out.print("Item " + (i + 1) + " - Value: ");
            int value = scanner.nextInt();
            items[i] = new Item(weight, value);
        }

        System.out.print("Enter the maximum capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        scanner.close();

        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparing(Item::getRatio).reversed());

        int[] selectedItems = new int[n];
        int totalValue = 0;
        int currentWeight = 0;

        for (int i = 0; i < n; i++) {
            if (currentWeight + items[i].weight <= capacity) {
                selectedItems[i] = 1;
                currentWeight += items[i].weight;
                totalValue += items[i].value;
            } else {
                selectedItems[i] = 0;
            }
        }

        System.out.println("\nSelected items for the knapsack (1 for selected, 0 for not selected):");
        for (int i : selectedItems) {
            System.out.print(i + " ");
        }

        System.out.println("\nTotal value in the knapsack: " + totalValue);
    }
}
