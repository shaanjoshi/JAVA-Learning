// Find the factorial of a number


package Day7;

import java.util.*;

public class Exercise3 {
    public static void numberFactorial(int num){
        if(num<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        numberFactorial(num);
        
    }
}
