package oops.ex2;

class Triangle {
    int a, b, c;
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    int getArea() {
        int s = (a + b + c) / 2;
        return (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    int getPerimeter() {
        return a + b + c;
    }
}

public class Test5 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Area of the triangle is: " + t.getArea());
        System.out.println("Perimeter of the triangle is: " + t.getPerimeter());
    }
}