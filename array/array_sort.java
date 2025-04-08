import java.util.*;
public class array_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        if(issorted(arr,n)){
            System.out.print("Sorted");
        }else{
            System.out.print("Not sorted");
        }
    }
    public static boolean issorted(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}