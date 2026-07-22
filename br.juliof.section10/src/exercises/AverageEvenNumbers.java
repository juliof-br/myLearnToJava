package exercises;

import java.util.Locale;
import java.util.Scanner;

public class AverageEvenNumbers {
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

        double sum = 0.0;
        double average = 0.0;
        double countNumbers = 0.0;

        for (double number : numbers) {
            if (number % 2 == 0) {
                sum += number;
                countNumbers++;
            }
        }

        if (sum != 0) {
            average = sum / countNumbers;
            System.out.println("The average of even numbers is: " + average);
        } else {
            System.out.println("No even numbers!");
        }

        input.close();
    }
}