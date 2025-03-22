import java.util.*;
public class index_replace_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        replace(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void replace(int arr[]){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sum-arr[i];
        }
    }
}
