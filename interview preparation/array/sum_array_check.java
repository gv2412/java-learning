import java.util.*;
class sum_array_check{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        int r=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==key)
                if(arr[i]+arr[j]==key){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}