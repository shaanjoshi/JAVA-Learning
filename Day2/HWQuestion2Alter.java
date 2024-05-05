package Day2;

import java.util.*;
public class HWQuestion2Alter {
    public static void main(String[] args) {
        System.out.println("Please enter your number to find multiplication table");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        while (i<=10) {
            int result = number*i;
            System.out.println(number + "*" + i + "=" + result);
            i++;
        }
    };
}
