import java.util.*;
public class decenting_order {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int temp=n;
        int i=0;
        while(temp>0){
            int rem=temp%10;
            arr[i]=rem;
            i++;
            temp=temp/10;
        }
        Arrays.sort(arr);
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
