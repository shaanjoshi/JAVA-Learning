package Day5;

public class PatternQuestion5 {
    public static void main(String[] args) {
        int n = 4;
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Inner loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // for next line
            System.out.println("");
        }
    }
}
