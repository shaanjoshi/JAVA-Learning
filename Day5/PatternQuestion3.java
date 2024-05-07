package Day5;

public class PatternQuestion3 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Uncomment below code to see alternate solution

/*public class PatternQuestion3 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
*/
