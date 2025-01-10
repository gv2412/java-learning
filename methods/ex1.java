//with args with return type
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(a-diff_revnum(a));
    }
    public static int diff_revnum(int a){
        int res=0;
        while(a>0){
            int d=a%10;
            res=res*10+d;
            a=a/10;
        }
        return res;
        }
}
