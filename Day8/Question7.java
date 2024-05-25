// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
package Day8;
import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;
    
        do{
            System.out.print("Enter a number: ");
            float num = sc.nextFloat();
    
            if (num>0) {
                positiveCount++;
            }else if (num < 0) {
                negativeCount++;
            }else{
                zeroCount++;
            }
    
            System.out.print("Do you want to enter another number? (Y or N): ");
            choice = sc.next().charAt(0);
    
        
        }while(choice == 'y' || choice == 'Y');
    
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);
        
    }

}


