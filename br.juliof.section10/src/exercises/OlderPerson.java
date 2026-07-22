package exercises;

import java.util.Locale;
import java.util.Scanner;

public class OlderPerson {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name to " + (i + 1) + "ª person: ");
            input.nextLine();
            names[i] = input.nextLine();
            System.out.print("Enter the age to " + (i + 1) + "ª person: ");
            ages[i] = input.nextInt();
        }

        int largestOld = ages[0];
        int positionLargestOld = 0;
        String olderPerson = null;

        for (int i = 0; i < n; i++) {
            if (ages[i] > largestOld) {
                largestOld = ages[i];
                positionLargestOld = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (positionLargestOld == i) {
                olderPerson = names[i];
            }
        }

        System.out.println("The older person is: " + olderPerson);

        input.close();
    }
}
