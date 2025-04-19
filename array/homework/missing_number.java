package homework;
import java.util.*;
public class missing_number {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        int total_sum=(n+1)*(n+2)/2;
        int missing_number=total_sum-sum;
        System.out.print("missing number is "+missing_number);
    }
}
    