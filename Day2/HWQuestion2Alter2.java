package Day2;

import java.util.*;
public class HWQuestion2Alter2 {
    public static void main(String[] args) {
        System.out.print("Please enter your number to find multiplication table:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
    }
}
