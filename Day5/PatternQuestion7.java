package Day5;

public class PatternQuestion7 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for each row, printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

/*
 Alternate solution

 public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print numbers in each row
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
 */
