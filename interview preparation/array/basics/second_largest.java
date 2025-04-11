package basics;
import java.util.*;
public class second_largest {
      public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
         }
      second_max(arr,n);
    }   
    public static void second_max(int arr[],int n){
        if(n<2){
            System.out.print("The array must have atleast two numbers");
            return;
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2&&max2!=max1){
                max2=arr[i];
            }
        }
        if(max2==max1){
            System.out.print("no maximum element");
        }else{
            System.out.print(max2);
        }
    }
}
