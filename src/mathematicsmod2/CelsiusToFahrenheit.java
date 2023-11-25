package mathematicsmod2;

import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        double tempInCelsius = sc.nextDouble();
        double tempInFahrenheit = getFahrenheit(tempInCelsius);
        System.out.println("Temperature in Fahrenheit is: " +  tempInFahrenheit);
    }

    static double getFahrenheit(double n)
    {
        return (n * 9 / 5) + 32;
    }
}
