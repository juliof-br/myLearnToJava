package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: (max: 10) ");
        int n = input.nextInt();
        if (n > 10) {
            System.out.print("Number of positions invalid, try again: ");
            n = input.nextInt();
        }

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number of position " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("The negative numbers is: ");
        for (int negative : numbers) {
            if (negative < 0) {
                System.out.println(negative);
            }
        }

        input.close();
    }
}