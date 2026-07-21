package exercises;

import java.util.Locale;
import java.util.Scanner;

public class EvenNumbers {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        int[] evenNumbers = new int[n];
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print("Enter the number of position " + (i + 1) + ": ");
            evenNumbers[i] = input.nextInt();
        }

        System.out.print("\nEven numbers entered: ");
        int countEvens = 0;
        for (int evenNumber : evenNumbers) {
            if (evenNumber % 2 == 0) {
                System.out.print(evenNumber + " ");
                countEvens++;
            }
        }

        System.out.println("\nTotal of even numbers: " + countEvens);

        input.close();
    }
}