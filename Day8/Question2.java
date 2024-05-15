// 2. Write a function to print the sum of all odd numbers from 1 to n 

package Day8;

/**
 * Question2
 */
import java.util.*;

public class Question2 {
    public static int sumOddNumbers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                sum = sum;
            }else{
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("The sum of all odd number till "+ num + " is "+ sumOddNumbers(num) );
    }
    
}