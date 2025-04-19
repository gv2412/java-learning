
import java.util.*;
public class treasue_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]+arr[j]==k && i!=j){
                System.out.print(i+" "+j);
            }
            j++;
        }
    }
}
