import java.util.Scanner;

public class CircularBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        int power = 0;
        int powerNumber = 1;
        String binary;
        int remaining;
        int count1 = 0;
        int count2 = 0;

        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.print("How many numbers are in the circle? (n): ");
        number = s.nextInt();
        binary = Integer.toBinaryString(number);

        power = binary.length() - 1;

        while (count1 < power)
        {
            while (count2 < 1)
            {
                powerNumber = powerNumber + powerNumber;
                count2++;
            }
            count2 = 0;
            count1++;
        }
        remaining = (number - powerNumber) + (number - powerNumber) + 1;

        System.out.println("The last remaining number is " + remaining);
    }
}
