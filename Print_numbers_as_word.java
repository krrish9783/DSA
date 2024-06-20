import java.util.Scanner;

public class Print_numbers_as_word {

    public static void main(String[] args) {
        int num = 511;

        // Convert the number to a string
        String numStr = String.valueOf(num);

        // Iterate over each character of the string
        for (int i = 0; i < numStr.length(); i++) {
            // Get the numeric value of the character
            int digit = Character.getNumericValue(numStr.charAt(i));
            
            // Use a switch statement to print the word for each digit
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
