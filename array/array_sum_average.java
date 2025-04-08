import java.util.*;
public class array_sum_average{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int avg=0;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            sum=sum+arr[i];
            avg=sum/n;
        }
        System.out.println("sum of the array elements is "+sum);
        System.out.println("average of the array elements is "+avg);
        System.out.println(Arrays.toString(arr));
    }
}
