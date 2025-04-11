package basics;
import java.util.*;
public class array_sum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        problem(arr,n);
    }
//-----------------------------------------------------------------------------------------------------------------------
     //ARRAY SUM OF ELEMENTS
//------------------------------------------------------------------------------------------------------------------------
    public static void problem(int arr[],int n){
        /*int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.print("The sum of array : "+sum);*/

        int sum=Arrays.stream(arr).sum();
        System.out.print(sum);
    }


}
