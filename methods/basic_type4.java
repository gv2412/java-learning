//with args with return type
import java.util.*;
public class basic_type4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("sum of two numbers is "+sum(a,b));
        System.out.println("difference of two numbers is "+diff(a,b));
        System.out.println("product of two numbers is "+mul(a,b));
        System.out.println("quotient of two numbers is "+div(a,b));
        System.out.println("remainder of two numbers is "+rem(a,b));
        System.out.println(oddoreven(a,b));
        System.out.println(positive(a,b));
       
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int diff(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int rem(int a,int b){
        return a%b;
    }
    public static String oddoreven(int a,int b){
        if(a%2==0 && b%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static String positive(int a,int b){
        if(a>0 && b>0){
            return "positive";
        }
        else{
            return "negative";
        }
    }
}
