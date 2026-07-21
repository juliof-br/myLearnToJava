package application;


import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many products do you want to register? ");
        int n = input.nextInt();
        Products[] products = new Products[n];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter the description for product " + (i + 1) + ": ");
            input.nextLine();
            String description = input.nextLine();
            System.out.print("Enter the price for product " + (i + 1) + ": ");
            double price = input.nextDouble();
            products[i] = new Products(description, price);
        }

        double sum = 0;
        // Loop suggested by the IDE.
        for (Products product : products) {
            sum += product.getPrice();
        }

        double average = sum / products.length;
        System.out.printf("The average price of the products is: US$ %.2f%n", average);

        input.close();
    }
}