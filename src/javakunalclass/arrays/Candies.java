package javakunalclass.arrays;
import  java.util.List;
import  java.util.ArrayList;



public class Candies {
    public static void main(String[] args) {
    int[] arr= {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> list1 = new ArrayList<Boolean>(n);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < n; i++) {
            int currSum = candies[i] + extraCandies;
            if (currSum >= max) {
                list1.add(true);
            } else {
                list1.add(false);
            }
        }
        return list1;
    }
}
