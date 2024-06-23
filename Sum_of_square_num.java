import java.util.Scanner;

public class Sum_of_square_num {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the max range nuber :");
        int n=sc.nextInt();
        int i=1,sum=0;
        while (i<=n) {
            
            System.out.print("\nThe sum of "+i+" Square with previous square number : "+(i*i)+" + "+sum);
            sum=sum+i*i;
            i++;
            
        }

        System.out.print("\n\nHence total sum of squared range is : "+sum);
        




    }
    
}
