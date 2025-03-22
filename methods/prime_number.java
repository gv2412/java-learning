import java.util.*;
public class prime_number {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(isprime(n));
    }
    public static String isprime(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            return "prime";
        }else{
            return "not prime";
        }
    }
}
