public class Largenum_divby_sixornot {
    public static void main(String[] args) {

        int[] arr={10,20,40,60};

       int max=arr[0];

        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
        }
    }
    

        System.out.println("Maximum number in the array is "+max);

        if(max%6==0){
            System.out.println("Yes the maximum number is divisible by 6");
        }
        else {
            System.out.println("No the maximum number is not divisible by 6");
        }

    }
    
}
