package Day5;

public class PatternQuestion2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // Outer loop 
        for (int i = 1; i <= n; i++) {
            // Inner loop 
            for (int j = 1; j <= m; j++) {
                // Cell --> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
