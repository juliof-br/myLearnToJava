package challenges.employeelist.application;

import challenges.employeelist.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? :: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the ID of employee #" + (i + 1) + ": ");
            Integer id = input.nextInt();
            System.out.print("Enter the name of employee #" + (i + 1) + ": ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Enter the salary of employee #" + (i + 1) + ": ");
            Double salary = input.nextDouble();

            Employee newEmployee = new Employee(id, name, salary);
            employees.add(newEmployee);
        }

        int findID;

        System.out.print("Do you wish to increase an employee's salary? (Y/n): ");
        char response = input.next().charAt(0);
        if (response == 'Y' || response == 'y') {
            System.out.print("Enter the employee ID: ");
            findID = input.nextInt();
            for (Employee employee : employees) {
                if (employee.getId() == findID) {
                    System.out.print("Enter the percentage you wish to increase: ");
                    double percentageIncrease = input.nextDouble();
                    employee.setSalary(employee.newSalary(percentageIncrease));
                    System.out.println();
                    System.out.println("Updated Employee's Salary");
                    System.out.println(employee);
                } else if (employee.getId() != findID) {
                    System.out.println();
                    System.out.println("This ID does not exist!");
                }
            }
        } else if (response == 'N' || response == 'n') {
            System.out.println();
            System.out.println("List of Employees:");
            System.out.println(employees);
        }

        input.close();
    }
}