import java.util.Scanner;
public class Circular {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        double calcNumber;
        int power = 0;
        int remaining;

        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.print("How many numbers are in the circle? (n): ");
        number = s.nextInt();
        calcNumber = number;

        while(!(calcNumber < 2))
        {
            calcNumber = calcNumber / 2;
            power++;
        }
        remaining = (number - (int)Math.pow(2, power)) * 2 + 1;

        System.out.println("The last remaining number is " + remaining);
    }
}
