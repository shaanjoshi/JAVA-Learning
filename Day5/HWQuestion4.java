// Print palindromin number pyramid
/*
1 1
2 3
3 5
4 7
5 9

    1  
   212
  32123
 4321234
543212345
for lest side
1 4space 1
2 3space 21
3 2space 321
4 1space 4321
5 0space 54321
*/
package Day5;

public class HWQuestion4 {
    public static void main(String[] args) {
        int n = 5;

        for(int i =1; i<=n; i++){
            // loop for space 
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // loop for decresing number
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // loop for increasing number 
            for(int l = 2; l<=i; l++){
                System.out.print(l);
            }
            System.out.println("");
        }
    }

}
