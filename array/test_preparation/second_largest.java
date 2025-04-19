package test_preparation;
import java.util.*;
public class second_largest {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        // int k=s.nextInt();
        second_largest(arr,n);
        // kth_largest(arr,n,k);
    }
    public static void second_largest(int arr[],int n){
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>m1){
                m2=m1;
                m1=arr[i];
            }
            else if(arr[i]>m2&&m1!=m2){
                m2=arr[i];
            }
        }
        System.out.println("second largest element : "+ m2);
    }
    // public static void kth_largest(int arr[],int n,int k){
    //     Arrays.sort(arr);
    //     System.out.print(k+" largest element : "+(n-k+1));
    // }
}
