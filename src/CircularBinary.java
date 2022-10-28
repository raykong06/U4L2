import java.util.Scanner;

public class CircularBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        double calcNumber;
        int power = 0;
        int count = 0;
        int remaining;

        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.print("How many numbers are in the circle? (n): ");
        number = s.nextInt();
        calcNumber = number;

        while(!(calcNumber < 2))
        {
            while(calcNumber <= 0)
            {
                calcNumber = calcNumber - 2;
                count++;
            }
        }
        remaining = (number - (int)Math.pow(2, power)) * 2 + 1;

        System.out.println("The last remaining number is " + remaining);
    }
}
