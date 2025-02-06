import java.util.*;
public class max_digit_possibility {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int power=1;
        while(power<=n){
            power=power<<1;
        }
        System.out.print(power);
    }
}
