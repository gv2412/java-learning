import java.util.*;
public class now_of_bits_consumed {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        while(n>0){
            n=(n&(n-1));
            count++;
        }
        System.out.print(count);
    }
}
