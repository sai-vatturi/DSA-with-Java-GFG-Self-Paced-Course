package classlectures.cattwo;

public class MaxActivities {
    public static void main(String[] args) {
        int s[] = {1, 3, 0, 5, 8, 5};
        int f[] = {2, 4, 6, 7, 9, 9};

        int n = s.length;
        printMaxActivities(s, f, n);
    }

    private static void printMaxActivities(int[] start, int[] end, int n) {
        int i, j;

        System.out.println("Following Activities are Selected: ");
        i = 0;
        System.out.print(i + " ");

        for (j = 1; j < n; j++) {
            if (start[j] >= end[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }
}
