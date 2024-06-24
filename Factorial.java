import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Factorial calculation: ");
        int n = sc.nextInt();
        sc.close();
        
        int fact = 1;
        
        if (n == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }
}
