package homework;
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


    //method 1:

   /*  public static void second_max(int arr[],int n){
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }else if(arr[i]>second_max && arr[i]!=max){
                second_max=arr[i];
            }
        }
        System.out.println(second_max);
    }*/


    //method 2:

   /*  public static void second_max(int arr[],int n){
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }*/


    //method 3:
    public static void second_max(int arr[],int n){
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                second_max=max;
                max=arr[i];
            }
            if(arr[i]>second_max && arr[i]!=max){
                second_max=arr[i];
            }
        }
        System.out.println(second_max);
    }
}
