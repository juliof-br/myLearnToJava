package exercises;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SumVectors {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        int[] numbersA = new int[n];
        int[] numbersB = new int[n];
        int[] numbersC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of position " + i + " in the vector A: ");
            numbersA[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of position " + i + " in the vector B: ");
            numbersB[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            numbersC[i] = numbersA[i] + numbersB[i];
        }

        System.out.print("The sum of the numbers A and B that define vector C is: ");
        System.out.println(Arrays.toString(numbersC));

        input.close();
    }
}