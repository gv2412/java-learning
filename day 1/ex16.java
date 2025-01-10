//neon number
import java.util.*;
public class ex16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum = n*n;
        int square=0;

        while(sum>0){
            int d = sum%10;
            square = square+d;
            sum=sum/10;
        }
        if(square==n){
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon number");
        }
    }
}
