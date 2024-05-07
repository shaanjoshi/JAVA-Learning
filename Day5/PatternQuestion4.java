package Day5;

public class PatternQuestion4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <=n; i++) {
            for (int j = n ; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Alternate solution
/*
public class PatternQuestion3 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
 
 */