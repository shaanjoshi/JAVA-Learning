package Day7;

import java.util.*;
public class Exercise1 {
    public static void printMyname(String name){
        System.out.println("Hello "+ name +"!");
        return;
    }
    public static void main(String args[]) {
        System.out.print("Tell your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyname(name); //function call
        sc.close();
    }
}
