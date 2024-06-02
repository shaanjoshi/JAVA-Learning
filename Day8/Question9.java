// Write a function that calculates the Greatest Common Divisor of 2 numbers. 
package Day8;

import java.util.Scanner;

public class Question9 {

    // Function to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        a = Math.abs(a); // Ensure a is positive
        b = Math.abs(b); // Ensure b is positive

        // Handle the special case where both numbers are zero
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("GCD is undefined for both numbers being zero.");
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        try {
            // Calculating the GCD of the two numbers
            int gcd = calculateGCD(num1, num2);
            // Displaying the result
            System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        } catch (IllegalArgumentException e) {
            // Handling the case where both numbers are zero
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}


