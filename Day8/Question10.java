// Write a function that calculates the Greatest Common Divisor of 3 numbers. 
package Day8;

import java.util.Scanner;

public class Question10 {

    // Function to calculate GCD of two numbers using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        a = Math.abs(a); // Ensure a is positive
        b = Math.abs(b); // Ensure b is positive

        // Handle the special case where both numbers are zero
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("GCD is undefined for both numbers being zero.");
        } 
        /* IllegalArgumentException is an unchecked exception that is thrown to indicate that a method has been 
        passed an illegal or inappropriate argument. It is part of the java.lang package.*/

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate GCD of three numbers
    public static int calculateGCDofThree(int num1, int num2, int num3) {
        int gcdOfFirstTwo = calculateGCD(num1, num2);
        return calculateGCD(gcdOfFirstTwo, num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        try {
            // Calculating the GCD of the three numbers
            int gcd = calculateGCDofThree(num1, num2, num3);
            // Displaying the result
            System.out.println("The GCD of " + num1 + ", " + num2 + " and " + num3 + " is: " + gcd);
        } catch (IllegalArgumentException e) {
            // Handling the case where inputs are not valid
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

