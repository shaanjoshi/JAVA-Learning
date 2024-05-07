package Day5;

import java.util.*;
public class PatternQuestion1 {
    public static void main(String[] args) {
        System.out.print("Enter the symbol: ");
        Scanner sc = new Scanner(System.in);
        String symbol = sc.next();
        
        // Outer Loop
        for (int i = 1; i <= 4; i++) {
            // Inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        sc.close();
    }
}
