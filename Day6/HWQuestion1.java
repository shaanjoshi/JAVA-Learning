package Day6;

public class HWQuestion1 {
    public static void main(String[] args) {
        
        int n = 5;
        // upperhalf
        for(int i = 1; i<=n; i++){
            // left-side 
            for(int j = 1; j<= i; j++){
                if (j==i || j==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            // space between sides 
            for (int j= 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // right side 
            for(int j=1; j<=i; j++){
                if (j==1 || j ==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // lower half 

        for(int i = n; i>=1; i--){
            // left-side 
            for(int j = 1; j<= i; j++){
                if (j==i || j==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            // space between sides 
            for (int j= 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // right side 
            for(int j=1; j<=i; j++){
                if (j==1 || j ==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
}
}

// print hollow butterfly n = 5

/*
 * 
 * *
 ** **
 * * * *
 * * * *
 * ** *
 * ** *
 * * * *
 * * * *
 ** **
 * *
 * 
 * 
 */
