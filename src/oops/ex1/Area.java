import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculating Area of a Circle: ");
        System.out.println("Enter Radius: ");
        int radius = sc.nextInt();
        System.out.printf("The Area of Circle with Radius " + radius + " is: %.2f units", areaOfCircle(radius));

        System.out.println("\nCalculating Area of a Triangle using Sides: ");
        System.out.println("Enter Side a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The Area of Triangle is " + areaOfTriangle(a, b, c));

        System.out.println("Calculating Area of a Triangle using Base and Height: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("The Area of Triangle is " + areaOfTriangle2(base, height));

    }

    public static double areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static int areaOfTriangle(int a, int b, int c) {
        double s = (a + b + c) / 2.0;
        return (int) Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public static int areaOfTriangle2(int base, int height) {
        return (base * height) / 2;
    }
}
