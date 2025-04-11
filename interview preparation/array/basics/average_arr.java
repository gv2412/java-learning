package basics;

import java.util.*;

public class average_arr {
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
    //AVERAGE VALUE OF THE ARRAY
//------------------------------------------------------------------------------------------------------------------------

    public static void problem(int arr[],int n){
        /*int avg=0;
        int sum=0;
        for(int num:arr){
            sum+=num;
            avg=sum/n;
        }
        System.out.print("Average of the array : "+avg);*/

        double avg=Arrays.stream(arr).average().orElse(-1);
        System.out.print(avg);
    }

}
