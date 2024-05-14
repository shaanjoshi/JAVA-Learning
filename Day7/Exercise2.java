// Make function to add 2 numbers and return the sum

package Day7;

import java.util.*;
public class Exercise2 {
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter number 1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        int sum = calculateSum(num1, num2);

        System.out.println("The sum of two numbers is: " + sum);
    }
}
