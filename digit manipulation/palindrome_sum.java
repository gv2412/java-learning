import java.util.*;
public class palindrome_sum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int reverse=reversed(n);
        int sum=reverse+n;
        int reverse_sum=rev_sum(sum);
        System.out.println(sum);
        System.out.println(reverse_sum);
        if(reverse_sum==sum){
            System.out.println("palindrome");
        }else{
            System.out.print("not palindrome");
        }
    }
    public static int reversed(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }
    public static int rev_sum(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev;
    }
}
