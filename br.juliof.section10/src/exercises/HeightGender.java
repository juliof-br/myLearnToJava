package exercises;

import java.util.Locale;
import java.util.Scanner;

public class HeightGender {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        char[] genders = new char[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the height of " + (i + 1) + "ª person: ");
            heights[i] = input.nextDouble();
            System.out.print("Enter the gender 'F' or 'M' of " + (i + 1) + "ª person: ");
            genders[i] = input.next().charAt(0);
        }

        double largestHeight = heights[0];
        double minimumHeight = heights[0];
        for (int i = 0; i < n; i++) {
            if (heights[i] > largestHeight) {
                largestHeight = heights[i];
            }
            if (heights[i] < minimumHeight) {
                minimumHeight = heights[i];
            }
        }

        double sumWomenHeight = 0.0;
        int countWomen = 0;
        for (int i = 0; i < n; i++) {
            if (genders[i] == 'F') {
                sumWomenHeight += heights[i];
                countWomen++;
            }
        }
        double averageWomenHeight = sumWomenHeight / countWomen;

        int countMen = 0;
        for (int i = 0; i < n; i++) {
            if (genders[i] == 'M') {
                countMen++;
            }
        }

        System.out.println("The minimum height is: " + minimumHeight);
        System.out.println("The largest height is: " + largestHeight);
        System.out.printf("The average of women's heights is: %.2f%n", averageWomenHeight);
        System.out.println("The total number of men is: " + countMen);

        input.close();
    }
}
