package exercises;

import java.util.Locale;
import java.util.Scanner;

public class UnderAverage {
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

        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.printf("The average of number in vector Numbers is: %.3f%n", average);
        System.out.println("Below-average numbers: ");
        for (double number : numbers) {
            if (number < average) {
                System.out.println(number);
            }
        }

        input.close();
    }
}