package Day3;

/**
 * Day3
 */
import java.util.*;
public class Day3 {

    public static void main(String[] args) {
        System.out.print("Enter the button: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namastey");
            break;
            case 3: System.out.println("Bounjour");
            break;
            default: System.out.println("Invalid Input");
        }


    }
}
