// program to find wether the number is even or odd using functions in java
package Day7;

import java.util.*;;

public class HWQuestion3 {
    public static boolean isEven(int n){
        if (n%2 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.print("The number is Even");
        }else{
            System.out.print("The number is odd");
        }
    }
}
