package Day4;

// Sum of first n Natural numbers
import java.util.*;
public class Day4 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("The Sum is: "+sum);
    }
    
}
