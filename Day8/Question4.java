// Write a function that takes in the radius as input and returns the circumference of a circle.

package Day8;

import java.util.*;

public class Question4 {
    public static float calculateCircumference(float r){
        float circumference = 2 * 3.14f * r;
        return circumference;
    }
    public static void main(String[] args) {
        System.out.print("Enter the radius in cm: ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.print("The circumference of the circle is " + calculateCircumference(radius)+"cm");
    }
}
