package Duplicates_Frequency_Count;
import java.util.*;
public class detect_duplicate {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int[] d=duplicate(arr,n);
        if(check_isduplicate(arr,n)){
            System.out.print("duplicate array with elements :"+Arrays.toString(d));
        }else{
            System.out.print("unique array");
        }
    }
    public static boolean check_isduplicate(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] duplicate(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return new int[] {arr[i]};
                }
            }
        }
        return new int[]{};
    }
}
