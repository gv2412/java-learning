
import java.util.*;
public class non_fibnocci {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        nonfib(n);
    }
    public static void nonfib(int n){
        int arr[]=new int[n];
        Set<Integer> fib=new HashSet<>();
        int a=0;
        int b=1;
        while(a<=n){
            fib.add(a);
            int temp=a+b;
            a=b;
            b=temp;
        }
        for(int i=0;i<=n;i++){
            if(!fib.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
