import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = 'y';  // Initialize char c properly

        while (c == 'y' || c == 'Y') {  // Allow both lowercase and uppercase 'y'
            System.out.print("Enter the number:");
            int number = sc.nextInt();
            int tempnum = number;

            int rev = 0;

            while (number != 0) {
                int lastdigit = number % 10;
                rev = rev * 10 + lastdigit;
                number /= 10;
            }

            if (tempnum == rev) {
                System.out.println("The number is a palindrome");
            } else {
                System.out.println("The number is not a palindrome");
            }

            System.out.print("Want to check more y/n : ");
            c = sc.next().charAt(0);
        }

        sc.close();  // Close the scanner
    }
}
