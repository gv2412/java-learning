import java.util.*;
public class array_min_max_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        min_max(arr,n);
    }
    public static void min_max(int arr[],int n){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++){
        min=Math.min(arr[i], min);
        max=Math.max(arr[i], max);
        }
        System.out.print(min+" "+max);
    }
}
