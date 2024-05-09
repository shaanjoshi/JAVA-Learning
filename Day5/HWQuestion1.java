// print a solid rhombus
/*
    *****
   *****
  *****
 *****
*****

Below is analysis
r=1 4space, 5 star
r=2 3 space, 5star
r=3 2 space, 5star
r=4 1 space, 5star
r=5 0 space, 5 star
 */

 package Day5;
 
 /**
  * HWQuestion1
  */
 public class HWQuestion1 {
 
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
 }