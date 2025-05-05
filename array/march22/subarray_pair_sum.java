import java.util.Scanner;

public class subarray_pair_sum {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int num=s.nextInt();
        subarray_pairsum(arr,n,num);
    }
    public static void subarray_pairsum(int arr[],int n,int key){
        int re[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum==key){
                        re[k]=arr[k];
                        System.out.println(re[k]+" ");
                    }
                }
                
            }
        }
    }
}
