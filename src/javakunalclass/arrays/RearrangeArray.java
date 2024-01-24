package javakunalclass.arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {3,-2,1,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int indexP = 0;
        int indexN = 1;
        for (int i = 0; i < n; i++){
            if(nums[i] > 0){
                arr[indexP] = nums[i];
                indexP = indexP + 2;
            } else if(nums[i] < 0){
                arr[indexN] = nums[i];
                indexN = indexN + 2;
            }
        }
        return arr;
    }
}

