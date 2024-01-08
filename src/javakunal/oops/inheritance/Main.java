package javakunal.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 323.4, 53.3);
        Box box2 = new Box(box1);
        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BoxWeight bw1 = new BoxWeight(1.2, 2.3, 4.4, 3.2);
        System.out.println(bw1.h + " " + bw1.l + " " + bw1.w + " " + bw1.weight);

    }
}
