package classlectures.cat;

public class MajorityElement {
    public static void main(String[] args) {
            int[] arr = { 2, 2, 2, 2, 3, 5, 1 };
        findMajority(arr, 7);
    }
    static void findMajority(int arr[], int n)
    {

       int max = 0;
       int count = 0;
       for (int num : arr) {
           if (count == 0) {
               max = num;
           }
           if (num == max) {
               count++;
           } else {
               count--;
           }
       }
       int c = 0;
       for (int nums : arr) {
           if (max == nums) {
               c++;
           }
       }
       if (c > n/2) {
           System.out.println(max);
       } else {
           System.out.println("No majority element");

       }
    }
}


