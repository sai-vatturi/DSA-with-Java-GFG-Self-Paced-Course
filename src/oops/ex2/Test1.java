package oops.ex2;

import java.util.Scanner;

class Area {
    private int length;
    private int breadth;
    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int getArea() {
        return length * breadth;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter breadth :");
        int breadth = sc.nextInt();
        Area a = new Area();
        a.setDim(length, breadth);
        System.out.println("Area of rectangle is: " + a.getArea());
    }
}