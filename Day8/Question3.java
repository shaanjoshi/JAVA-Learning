// Write a function which takes in 2 numbers and returns the greater of those two.

package Day8;

import java.util.*;

public class Question3 {
    public static float comparsion(float n1, float n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter number 1:");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        System.out.print("Enter number 2:");
        float num2 = sc.nextFloat();

        float greater = comparsion(num1, num2);
        System.out.print("The greater number between " + num1 + " and " + num2 + " is " + greater);
    }
}
