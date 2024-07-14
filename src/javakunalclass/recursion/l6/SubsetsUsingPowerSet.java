package javakunalclass.recursion.l6;

import java.util.ArrayList;

public class SubsetsUsingPowerSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> subsetList = subSet(arr);
        for (ArrayList<Integer> list : subsetList) {
            System.out.println(list);
        }
    }
    static ArrayList<ArrayList<Integer>> subSet(int[] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < (1 << arr.length); i++) {
            ArrayList<Integer> subList = new ArrayList<>();
            for (int j = 0; j < arr.length; j++)  {
                if ((i & (1 << j)) != 0) {
                    subList.add(arr[j]);
                }
            }
            list.add(subList);
        }
        return list;
    }
}
