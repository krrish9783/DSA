import java.util.Scanner;
import java.util.*;


public class Average_numbers_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz,total=0;
        System.out.print("Enter array size:");
        sz = sc.nextInt();

        int[] arr=new int[sz];
        System.out.println("Enter array elements:");
        for(int i=0;i<sz;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];

            }
            double avg=total/sz;
            System.out.println("Average of array elements is: "+avg);

        }
}
