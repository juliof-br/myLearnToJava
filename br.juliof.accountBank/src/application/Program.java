package application;

import entities.User;

import java.util.Scanner;

public class Program {
    static void main() {

        // Scanner Open
        Scanner input = new Scanner(System.in);

        // Variables
        User userAccount;
        int operation;

        // Menu
        System.out.print(initialTitleMenu());
        System.out.print("Enter the account ID: ");
        int accountID = input.nextInt();
        System.out.print("Enter the account holder: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Will there be an initial deposit? (Y/n): ");
        char option = input.next().charAt(0);

        // Logical Return Function
        if (option == 'Y' || option == 'y') {
            System.out.print("Enter the initial deposit amount: ");
            double initialDeposit = input.nextDouble();
            userAccount = new User(accountID, holder, initialDeposit);
        } else {
            userAccount = new User(accountID, holder);
        }

        // Main Output
        System.out.println(reportTitleMenu());
        System.out.println(userAccount);

        // Additional Functions
        do {
            System.out.print(additionalMenu());
            System.out.print("Enter your option: ");
            operation = input.nextInt();
            if (operation == 1 ) {
                System.out.print("Enter the value a new deposit: ");
                double deposit = input.nextDouble();
                userAccount.addCash(deposit);
                System.out.println(updatedTitleMenu());
                System.out.println(userAccount);
            } else if (operation == 2) {
                System.out.print("Enter the value a new withdraw: ");
                double withdraw = input.nextDouble();
                userAccount.removeCash(withdraw);
                System.out.println(updatedTitleMenu());
                System.out.println(userAccount);
            } else if (operation == 3) {
                main();
            } else if (operation == 9) {
                System.out.println("Successfully logged out!");
            } else {
                System.out.println("Invalid option, try again!");
            }
        } while (operation != 9);

        // Scanner Close
        input.close();
    }

    static String initialTitleMenu(){
        return
                """
                
                •••••••••••••••••••••••••••
                ••• ACCOUNT BANK SYSTEM •••
                •••••••••••••••••••••••••••
                """;
    }
    static String reportTitleMenu(){
        return
                """
                
                •••••••••••••••••••••••••••
                ••• USER REPORT ACCOUNT •••
                •••••••••••••••••••••••••••
                """;
    }
    static String updatedTitleMenu(){
        return
                """
                
                ••••••••••••••••••••••••••••••
                ••• UPDATED REPORT ACCOUNT •••
                ••••••••••••••••••••••••••••••
                """;
    }
    static String additionalMenu(){
        return
                """
                
                To continue, choose one of the options below:
                1 - Make a deposit;
                2 - Make a withdrawal;
                3 - Create a new account;
                9 - Log out.
                
                """;
    }
}
