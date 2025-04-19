package test_preparation;
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
        rotate_reverse(arr,n,k);
    }
    public static void rotate_reverse(int arr[],int n,int k){
        if(n%2==0){
            System.out.println("right rotation:");
            int r[]=new int[n];
            for(int i=0;i<n;i++){
                r[(k+i)%n]=arr[i];
            }
            System.out.print("rotated array: ");
            System.out.print(Arrays.toString(r));
            System.out.println("rotated array: ");
            for(int i=n-1;i>=0;i--){

            }
        }
    }
}
