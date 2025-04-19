import java.util.*;
public class budget_sum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int res[]=check_budget(arr, n, k);
        System.out.print(Arrays.toString(res));
    }
    public static int[] check_budget(int arr[],int n,int k){
        for(int i=0;i<n-1;i++){
            if(arr[i]+arr[i+1]<=k){
                return new int[]{arr[i],arr[i+1]};
            }
        }
        return new int[]{};
    }
}
