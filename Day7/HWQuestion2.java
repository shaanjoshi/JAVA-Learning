// Program to check wether the number is prime or not solution 2 using recursion

package Day7;

import java.util.*;

public class HWQuestion2 {
    public static int i = 2;
    public static boolean isPrime(int num){
        
        if(num == 1 || num == 0){
            return false;
        }
        else if(num == i){
            return true;
        }
        else if (num%i == 0) {
            return false;
        }

        i++;

        return isPrime(num);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.print(" The number is prime");
        }else{
            System.out.print(" The number is not prime");
        }
    }
}
