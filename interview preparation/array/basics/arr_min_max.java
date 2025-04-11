package basics;

import java.util.*;

public class arr_min_max {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        problem(arr,n);
    }
//-------------------------------------------------------------------------------------------------------------------------
    // Array min &max
//------------------------------------------------------------------------------------------------------------------------

    public static void problem(int arr[],int n){
        //METHOD-1:
        /*int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
            min=Math.min(arr[i],min);
            max=Math.max(arr[i],max);
        }
        System.out.print(min+" "+max);*/

        //METHOD-2:
        /*int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(min+" "+max);*/

        //METHOD-3:
        int min=Arrays.stream(arr).min().orElse(-1);
        int max=Arrays.stream(arr).max().orElse(-1);
        System.out.print(min+" "+max);
    }
}
