package basics;

import java.util.*;

public class arr_reverse {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        problem(arr,n);
    }
//------------------------------------------------------------------------------------------------------------------------
    //Array reverse the array
//------------------------------------------------------------------------------------------------------------------------

    /*public static void problem(int arr[],int n){
        for(int i=n-1;i>0;i--){
            System.out.print(Arrays.toString(arr));
            return;
        }
        
    }*/
    public static void problem(int arr[],int n){
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

}
