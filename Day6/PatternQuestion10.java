package Day6;

/**
 * PatternQuestion10
 */
public class PatternQuestion10 {

    public static void main(String[] args) {
        int n = 4;
        // upper half
        for (int i = 1; i <= n; i++) {
            // left side star 
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // for spaces 
            for(int l = 1; l<= 2*(n-i); l++){
                System.out.print(" ");
            }
            // right side star 
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // lower half
        for (int i = 1; i <= n; i++) { 
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            for(int l = 4; l>= 2*(n-i); l--){
                System.out.print(" ");
            }
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}