import java.util.*;
public class candy_pair {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();  
        System.out.print(count(arr,n,k));
    }
    public static int count(int arr[],int n,int k){
        int c=0;
        for(int i=0;i<n-k;i++){
            if(arr[i]==arr[i+k]){
                c++;
            }
        }
        return c;
    }
}
