package Day5;

public class PatternQuestion8 {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                System.out.print(" ");
                number++;
            }
            System.out.println("");
        }
    }
}
