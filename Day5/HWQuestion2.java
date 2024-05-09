// Print a number pyramid
/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */

package Day5;

public class HWQuestion2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // loop for space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // loop for number
            for (int k = 1; k <= i ; k++) {
                    System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
