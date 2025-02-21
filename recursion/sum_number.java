import java.util.*;
class sum_number {
   //generate a code to fing sum of n numbers using recursion
    public static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }

}
