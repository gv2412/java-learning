import java.util.*;
class odd_even{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(iseven(n)==true){
        System.out.print("even number ");
        }else{
        System.out.print("odd number ");
        }
    }
    public static boolean iseven(int n){
        return n%2==0;
    }
}