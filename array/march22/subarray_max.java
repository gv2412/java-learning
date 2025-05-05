import java.util.Scanner;

public class subarray_max {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        subarray_largest_sum(arr,n);
    }
    public static void subarray_largest_sum(int arr[],int n){
        int max = Integer.MIN_VALUE;
        int Sum = 0;
        int start = 0;
        int end = 0;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            Sum += arr[i];
            if (Sum > max) {
                max = Sum;
                start = temp;
                end = i;
            }
            if (Sum < 0) {
                Sum = 0;
                temp = i + 1;
            }
        }

        System.out.println("Maximum sum subarray:");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Maximum sum: " + max);
    }
}
