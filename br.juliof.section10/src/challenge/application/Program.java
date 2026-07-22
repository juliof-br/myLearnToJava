package challenge.application;

import challenge.entities.RentRooms;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        RentRooms[] rooms = new RentRooms[10];

        System.out.print("Enter the number of rooms you wish to rent: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Guest #" + i + ":");
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Mail: ");
            String mail = input.nextLine();
            System.out.print("Room Number: ");
            int roomNumber = input.nextInt();

            rooms[roomNumber] = new RentRooms(name, mail);
        }

        System.out.println();
        System.out.println("Busy Rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println("Room #" + i + ": " + rooms[i]);
            }
        }

        input.close();
    }
}