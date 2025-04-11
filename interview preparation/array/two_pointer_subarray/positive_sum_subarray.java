package two_pointer_subarray;
import java.util.*;
public class positive_sum_subarray {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        positive_sum(arr,n,k);
    }
    public static void positive_sum(int arr[],int n,int k){
        int start=0;
        int sum=0;
        for(int end=0;end<n;end++){
            sum+=arr[end];
            while(start<=end&&sum>k){
                    sum-=arr[start];
                    start++;
            }
            if(sum==k){
                    System.out.print("subarray found from the index "+start+" to "+end+ " is :");
                    for(int i=start;i<=end;i++){
                        System.out.print(arr[i]+" ");
                    }
                    return;
             }
        }
        System.out.print("no subarray fount with the sum");
    }
}
