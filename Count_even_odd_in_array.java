import java.util.*;
import java.util.Scanner;

public class Count_even_odd_in_array {

    public static void main(String[] args) {


       int odd=0;
       int even=0;
       
       for(int i=1;i<=100;i++) {

          if(i%2==0) {
            even++;
          } else {
            odd++;
          }

       }
       System.out.print("\nTotal even and odd numbers from 1 to 100 is :");
       System.out.println("Even numbers: "+even+" Odd numbers: "+odd+"\n");

    }

    
}