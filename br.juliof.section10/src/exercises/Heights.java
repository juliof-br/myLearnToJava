package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Heights {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name to " + (i + 1) + "ª person: ");
            input.nextLine();
            names[i] = input.nextLine();
            System.out.print("Enter the age to " + (i + 1) + "ª person: ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height to " + (i + 1) + "ª person: ");
            heights[i] = input.nextDouble();
        }

        double sumHeight = 0.0;
        for (double height : heights) {
            sumHeight += height;
        }
        double avgHeight = sumHeight / heights.length;

        double countYounger = 0.0;
        for (int younger : ages) {
            if (younger < 16) {
                countYounger++;
            }
        }

        double percentYounger = (countYounger / ages.length) * 100.0;

        System.out.println();
        System.out.printf("Average height of registered individuals: %.2f meters.%n", avgHeight);
        System.out.printf("Percentage of Younger Persons: %.2f%%.%n", percentYounger);
        System.out.println("Names of persons under 16 years old:");

        for (int i = 0; i < n ; i++) {
            if (ages[i] < 16)
                System.out.println((i + 1) + ": " + names[i]);
        }

        input.close();
    }
}