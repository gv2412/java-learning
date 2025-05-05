import java.util.Scanner;

public class subarray_sum {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        subarray_total(arr,n);
    }
    public static void subarray_total(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                System.out.println(sum);
            }
        }

    }
}
