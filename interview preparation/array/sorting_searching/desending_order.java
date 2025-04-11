package sorting_searching;
import java.util.*;
public class desending_order {
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        sort(arr,n);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
//------------------------------------------------------------------------------------------------------------------------
    //BUBBLE SORT
//------------------------------------------------------------------------------------------------------------------------

    /*public static int[] sort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }*/


//------------------------------------------------------------------------------------------------------------------------
    //SELECTION SORT
//------------------------------------------------------------------------------------------------------------------------

    public static int[] sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
