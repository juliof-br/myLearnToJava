package exercises;

import java.util.Locale;
import java.util.Scanner;

public class LargestNumber {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        double[] numbers = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number of position " + i + ": ");
            numbers[i] = input.nextDouble();
        }

        double largestNumber = numbers[0];
        int largestPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
                largestPosition = i;
            }
        }

        System.out.println("The largest number is: " + largestNumber);
        System.out.println("The position of largest number is: " + largestPosition);

        input.close();
    }
}