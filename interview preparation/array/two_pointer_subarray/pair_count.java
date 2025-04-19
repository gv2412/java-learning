import java.util.*;
class pair_count{              
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        System.out.print(even(arr,n,k));
    }
    public static int even(int arr[],int n,int k) {
        int c=0;
        for(int i=0;i<n;i++){
            int sum=0; 
            int diff=0;
            for(int j=i+1;j<n;j++){
                sum=arr[i]+arr[j];
                diff=Math.abs(arr[i]-arr[j]);
                if(sum%2==0&&diff==k){
                    c++;
                }
            }
        }
        return c;
    }
}