public class Sum_of_digit { 
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num != 0) {
            System.out.println(num%10);
            sum = sum + num % 10;
            num = num / 10;
            System.out.println(num);
            }
            System.out.println("Sum of digits is " + sum);  
           
        }
           
}
