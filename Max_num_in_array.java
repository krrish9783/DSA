import java.util.*;

public class Max_num_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[3][3];

        System.out.println("Please eneter array elements:");

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print("please Enter value of matrix at ["+(i+1)+" "+(j+1)+"] :");
                arr[i][j]=sc.nextInt();
            }
        }

        int max=arr[0][0];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(max<arr[i][j]) {
                    max=arr[i][j];
                }
            
            }
        }

    System.out.println("The given matrix is :");
    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
    }
    System.out.print("Where the Maximum element is : "+max+"\n");
    }
                   
}
