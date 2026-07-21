package exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SumAverage {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number of position " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.println("Entered numbers: " + Arrays.toString(numbers));
        System.out.printf("The sum of numbers is: %.2f%n", sum);
        System.out.printf("The average of numbers is: %.2f%n", average);

        input.close();
    }
}
