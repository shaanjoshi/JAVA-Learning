// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
package Day8;
import java.util.*;
public class Question8 {
    public static int calculatePower(int x, int n){
        int powerProduct = 1;
        for (int i = 1; i <= n; i++) {
            powerProduct *= x;
        }
        return powerProduct;
    }
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the power to be count for the number you entered: ");
        int n = sc.nextInt();

        System.out.print("The result is: "+ calculatePower(x, n));


    }
}
