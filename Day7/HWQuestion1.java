// program to find wether the number is prime or not

// Solution 1(alternate solution in HWQuestion2.java of day 7)

package Day7;

import java.util.*;
public class HWQuestion1 {

    public static void primeCheck(int num){
        int count = 0;
        if (num <= 1) {
            System.out.print("The number is not prime nor composite");
            return;
        }
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                count ++;
            }
        }

        if (count>2) {
            System.out.print("The number is not Prime");
        }else{
            System.out.println("The number is prime");
        }

        return;

    }
    
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        primeCheck(num);

    }
}
