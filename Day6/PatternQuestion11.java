package Day6;

public class PatternQuestion11 {
    public static void main(String[] args) {
        int n = 4;
        // upper half 
        for(int i = 1; i<=n; i++ ){
            // for space 
            for(int l = 3; l>=i; l--){
                System.out.print(" ");
            }
            // left side star
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            // right side star 
            for (int k = 2; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // lower half
        for(int i = 1; i<=n; i++ ){
            // for space 
            for(int l = 2; l<=i; l++){
                System.out.print(" ");
            }
            // left side star
            for (int j = n; j >=i ; j--) {
                System.out.print("*");
            }
            // right side star 
            for (int k = 3; k >=i ; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
