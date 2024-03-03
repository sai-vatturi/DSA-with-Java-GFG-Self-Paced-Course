package classlectures.sts;

import java.util.LinkedList;
import java.util.Scanner;

public class LoopDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            ll.push(sc.nextInt());
        }
        System.out.println(ll);
    }
}
