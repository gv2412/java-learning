
import java.util.*;
public class rotate_rev {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        rotate(arr,n,k);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void rotate(int arr[],int n,int k){
        k=k%n;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);

    }
    public static void rev(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
