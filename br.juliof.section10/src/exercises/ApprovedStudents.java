package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ApprovedStudents {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of positions: ");
        int n = input.nextInt();

        String[] names = new String[n];
        double[] grades1 = new double[n];
        double[] grades2 = new double[n];
        double[] averages = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name to " + (i + 1) + "º student: ");
            input.nextLine();
            names[i] = input.nextLine();
            System.out.print("Enter the first grade to " + (i + 1) + "º student: ");
            grades1[i] = input.nextDouble();
            System.out.print("Enter the second grade to " + (i + 1) + "º student: ");
            grades2[i] = input.nextDouble();
            averages[i] = (grades1[i] + grades2[i]) / 2.0;
        }

        System.out.println();
        System.out.println("The students who passed are:");
        for (int i = 0; i < n; i++) {
            if (averages[i] >= 6.0)
                System.out.println("• " + names[i]);
        }

        input.close();
    }
}