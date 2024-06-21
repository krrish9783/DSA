import java.util.*;

public class Perfectsquare {

    public static boolean Check(int num) {
        if (num < 0) {
            return false;
        } else {
            int sq = (int) Math.sqrt(num);
            if (sq * sq == num) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (Check(number)) {
            System.out.println("Number is a perfect square.");
        } else {
            System.out.println("Number is not a perfect square.");
        }
        sc.close();
    }
}
