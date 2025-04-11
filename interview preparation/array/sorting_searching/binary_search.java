package sorting_searching;
import java.util.*;
public class binary_search {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int i=search(arr,n,k);
        if(i!=-1){
            System.out.print("key found at index : "+i);
        }else{
            System.out.print("key not found");
        }
    }
    public static int search(int arr[],int n,int k){
        int first=0;
        int last=n-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return -1;
    }
}
