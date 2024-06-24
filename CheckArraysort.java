import java.util.Scanner;

public class CheckArraysort {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      // int[] arr = {1, 2, 3, 4, 5};
      System.out.print("Enter array size :");
       int sz=sc.nextInt();
       int arr[]=new int[sz];
       for(int i=0;i<sz;i++){
        System.out.print("Enter element "+(i+1)+":");
        arr[i]=sc.nextInt();
        }


       
        boolean flag=true;
       
       // System.out.println(arr.length);

       for(int i=0;i<arr.length-1;i++) {
       if(arr[i+1]>arr[i]){
        flag=true;
       } else {
        flag=false;
       }

    }
    if(flag) {
        System.out.println("Array is sorted in ascending order");
    } else {
        System.out.println("Array is not sorted in ascending order");
    }
    
}
}
