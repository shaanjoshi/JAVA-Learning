package Day7;

import java.util.*;
public class HWQuestion4 {

    public static void printTable(int n){
        for (int i = 1; i <=10; i++) {
            int product = n * i;
            System.out.println(n +" X "+i +" = "+ product);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printTable(num);

    }
}
