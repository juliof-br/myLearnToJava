package basics;

import java.util.Locale;
import java.util.Scanner;

public class ArraysBasics {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Define length and create the vector.
        System.out.print("How many measurements do you wish to enter? ");
        int n = input.nextInt();
        double[] vector = new double[n];

        // Read the data to vector.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the measurement in position " + (i + 1) + ": ");
            vector[i] = input.nextDouble();
        }

        double sum = 0;

        // Sum the data in the vector.
        for (int i = 0; i < n; i++){
            sum += vector[i];
        }

        // Return the average of the data (height measurements).
        double average = sum / n;
        System.out.printf("The average of the entered measurements is: %.2f%n", average);

        input.close();
    }
}