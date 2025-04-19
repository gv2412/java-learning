import java.util.*;
public class sum_subarray {
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            sum(arr,n);
        }
        public static void sum(int arr[],int n){
            int max=Integer.MIN_VALUE;
            int sum=0;
            int start=0;
            int end=0;
            int temp=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum>max){
                    max=sum;
                    start=temp;
                    end=i;
                }else if(sum<0){
                    sum=0;
                    temp=i+1;
                }
            }
            System.out.println("sum of subarray : "+max);
            System.out.print("subarray : ");
            for(int i=start;i<=end;i++){
                System.out.print(arr[i]+" ");
            }

        }
}
