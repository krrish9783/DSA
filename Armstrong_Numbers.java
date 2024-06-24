import java.util.*;

public class Armstrong_Numbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the number :");
        int n=sc.nextInt();
        int temp=n;
        int size=String.valueOf(temp).length();
        int sum=0;
        while(n!=0) {
            int last=n%10;
            sum+=Math.pow(last,size);
            n=n/10;
                }
                if(temp==sum) {
                    System.out.println("\tGiven Number is Armstrong");
                } else {
                    System.out.println("\tGiven Number is not Armstrong");
                }
    }
}