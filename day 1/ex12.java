// gcd of a number
import java.util.*;
public class ex12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int gcd = 1;

        for(int i=1;i<n;i++){
            if(n%i==0){
                gcd = gcd*i;
                
            }
            System.out.println(gcd);
        }
    }
}
