package Day4;

import java.util.Scanner;

public class HWQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        int marks;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enter marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter student's marks (out of 100): ");
                    marks = scanner.nextInt();
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60) {
                        System.out.println("This is also Good");
                    } else if (marks >= 0) {
                        System.out.println("This is Good as well");
                    } else {
                        System.out.println("Invalid marks entered!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option! Please enter 1 or 0.");
            }
        } while (option != 0);

        scanner.close();
    }
}
