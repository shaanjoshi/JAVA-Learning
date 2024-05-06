package Day3;

import java.util.*;

public class HWQuestion1 {

    public static void main(String[] args) {
        System.out.print("Enter number 1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Operation to be performed: ");
        String operation = sc.next();

        if (operation.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operation.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operation.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operation.equals("/")) {
            System.out.println(num1 / num2);
        } else if (operation.equals("%")) {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid operation!");
        }
    }
}
