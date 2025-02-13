import java.util.*;
public class count_digit_num {
    //generate a code to count the number of digits 
    public static int countDigit(long n){
        if(n==0) return 0;
        return 1+countDigit(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(countDigit(n));
    }
}
