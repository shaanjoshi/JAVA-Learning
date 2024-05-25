// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
package Day8;
import java.util.*;
public class Question5 {
    public static boolean eligiblityChecker(int age){
        if (age>18) {
            return true;
        }else{
            return false;
        }
    }

 public static void main(String[] args) {
    System.out.print("Enter your age: ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if (eligiblityChecker(age)) {
        System.out.print("You can vote");
    }else{
        System.out.print("You cannot vote");
    }
 }   
}
