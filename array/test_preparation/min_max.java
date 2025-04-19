package test_preparation;
import java.util.*;
public class min_max {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        minimum_maximum(arr,n);
    }

    // METHOD 1:
    // public static void minimum_maximum(int arr[],int n){
    //     int min=Arrays.stream(arr).min().orElse(-1);
    //     int max=Arrays.stream(arr).max().orElse(-1);
    //     System.out.print(min+" "+max);
    // }

    //METHOD 2:
    public static void minimum_maximum(int arr[],int n){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(min+" "+max);
    }

}
