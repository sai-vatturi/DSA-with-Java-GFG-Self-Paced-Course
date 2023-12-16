package javakunalclass.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputDynamicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // User Input
        for(int i = 0; i < 10; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
