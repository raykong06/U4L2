import java.util.Scanner;

public class CircularBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        int power = 0;
        String binary;
        int remaining;

        System.out.println("Welcome to the Circular Problem Solver!");
        System.out.print("How many numbers are in the circle? (n): ");
        number = s.nextInt();
        binary = Integer.toBinaryString(number);

        power = binary.length() - 1;

        remaining = (number - (int)Math.pow(2, power)) * 2 + 1;

        System.out.println("The last remaining number is " + remaining);
    }
}
