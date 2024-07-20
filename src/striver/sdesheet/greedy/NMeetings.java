package striver.sdesheet.greedy;

import java.util.*;

class Data {
    int start;
    int end;
    int index;
}

public class NMeetings {
    public static void main(String[] args) {
        int[] start = {0, 3, 1, 5, 5, 8};
        int[] end = {5, 4,2, 9, 7, 9};

        Data[] arr = new Data[start.length];

        for (int i = 0; i < start.length; i++) {
            arr[i] = new Data();
            arr[i].start = start[i];
            arr[i].end = end[i];
            arr[i].index = i + 1;
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o.end));

        List<Integer> list = new ArrayList<>();
        int count = 1;
        int endTime = arr[0].end;
        list.add(arr[0].index);


        for (int i = 1; i < arr.length; i++) {
            if (arr[i].start >=  endTime) {
                count += 1;
                endTime = arr[i].end;
                list.add(arr[i].index);
            }
        }
        System.out.println("Jobs: " + list);
        System.out.println("No of jobs: " + count);


        for (Data i : arr) {
            System.out.println(i.start + " " + i.end + " " + i.index);
        }

    }
}