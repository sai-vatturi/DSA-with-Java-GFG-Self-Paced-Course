package oops.ex5;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> student = new ArrayList<>();

        student.add(95);
        student.add(92);
        student.add(90);
        student.add(92);
        student.add(82);
        student.add(91);
        student.add(76);
        student.add(90);
        student.add(85);
        student.add(80);

        Iterator it = student.iterator();
        int sum = 0;

        while (it.hasNext()) {
            int marks = (int) it.next();
            sum += marks;
        }

        double average = (double) sum / student.size();

        System.out.println("The average marks of students is " + average);
    }
}
