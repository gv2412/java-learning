import java.util.*;
public class reverse_array_ele {
        public static void main(String[] args){
        Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            reverse(arr,n);
            System.out.print(Arrays.toString(arr));
        }
    public static void reverse(int arr[],int n){
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
