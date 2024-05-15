// 1. Enter 3 numbers from the user & make a function to print their average.

package Day8;

import java.util.*;

public class Question1 {
    public static int calculateAverage(int n1, int n2, int n3){
        int sum = n1+n2+n3;
        int average = sum/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();

        System.out.println("The average of above three numbers is: " + calculateAverage(num1, num2, num3));

    }
}
