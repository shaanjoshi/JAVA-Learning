package Day4;

import java.util.*;

public class HWQuestion1 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Even numbers up to " + num + ":");

        for (int i = 2; i <= num; i += 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
