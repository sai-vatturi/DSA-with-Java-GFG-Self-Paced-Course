package javakunal.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDDynamicArray {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        // Declaration
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(4);
        // Initialisation
        for(int i = 0; i  < 3; i++){
            list.add(new ArrayList<>());
        }
        // Adding
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j ++){
                list.get(i).add(sc.nextInt());
            }
        }
        // Get Individual Elements
        System.out.println(list.get(0).get(2));
        // Printing
        System.out.println(list);
    }
}
