import java.util.Scanner;

public class CircularBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        double calcNumber;
        int power = 0;
        String binary;
        int remaining;
        int index = 0;
        int length;

        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.print("How many numbers are in the circle? (n): ");
        number = s.nextInt();
        binary = Integer.toBinaryString(number);
        calcNumber = number;

        length = binary.length();

        while(index < length)
        {

        }
        remaining = (number - (int)Math.pow(2, power)) * 2 + 1;

        System.out.println("The last remaining number is " + remaining);
    }
}
